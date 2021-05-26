using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LentoCore.Parser;

namespace LentoCore.Evaluator
{
    public static class Evaluator
    {
        private static bool _syntaxError;
        private static string _errors;
        private static LentoParser _parser;
        public static EvaluatorResult Run(string input)
        {
            ICharStream characters = CharStreams.fromString(input + '\n');  // Add newline to end the last expression.
            ITokenSource lexer = new LentoLexer(characters);
            ITokenStream tokens = new CommonTokenStream(lexer);
            _parser = new LentoParser(tokens)
            {
                BuildParseTree = true
            };

            _parser.RemoveErrorListener(ConsoleErrorListener<IToken>.Instance);
            _parser.AddErrorListener(new ErrorListener());
            _syntaxError = false;
            IParseTree tree = _parser.compilation_unit();
            if (_syntaxError) return new EvaluatorResult
            {
                Succeeded = false,
                ErrorMessage = _errors,
                Remaining = characters.GetText(Interval.Of(characters.Index, characters.Size))
            };
        
            var value = "undefined";

            return new EvaluatorResult
            {
                Succeeded = true,
                Value = value,
                Remaining = characters.GetText(Interval.Of(characters.Index, characters.Size)),
                ParsedExpression = tree
            };
        }

        #region Error Handling

        private class ErrorListener : IAntlrErrorListener<IToken>
        {
            public void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
            {
                _syntaxError = true;
                _errors += $"Syntax Error (line {line}, col {charPositionInLine}): {Uppercase(msg)}\n";
            }

            private static string Uppercase(string msg)
            {
                msg = msg.Trim();
                return char.ToUpper(msg[0]) + msg.Substring(1);
            }
        }

        #endregion

        #region Pretty Print
        
        public static string PrettyPrint(IParseTree tree)
        {
            string result = string.Empty;
            PrettyRecursive(tree, ref result, 0, _parser.RuleNames);
            return result.TrimEnd();
        }

        private static void PrettyRecursive(IParseTree tree, ref string buf, int indent, string[] ruleNames)
        {
            for (int i = 0; i < indent; i++) buf += "  ";
            buf += PrettySanitize(Trees.GetNodeText(tree, ruleNames)) + '\n';
            for (int i = 0; i < tree.ChildCount; i++) PrettyRecursive(tree.GetChild(i), ref buf, indent + 1, ruleNames);
        }

        private static string PrettySanitize(string text) => text
            .Replace("\n", "\\n")
            .Replace("\t", "\\t")
            .Replace(" ", "' '");

        #endregion
    }
}
