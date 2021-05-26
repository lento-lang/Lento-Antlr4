using System;
using System.Collections.Generic;
using System.IO;
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

        public static EvaluatorResult Run(string input)
        {
            ICharStream characters = CharStreams.fromString(input);
            ITokenSource lexer = new LentoLexer(characters);
            ITokenStream tokens = new CommonTokenStream(lexer);
            LentoParser parser = new LentoParser(tokens)
            {
                BuildParseTree = true
            };

            parser.RemoveErrorListener(ConsoleErrorListener<IToken>.Instance);
            parser.AddErrorListener(new ErrorListener());
            _syntaxError = false;
            IParseTree tree = parser.compilation_unit();
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
    }
}
