using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LentoCore.Parser;

namespace LentoCore.Evaluator
{
    public static class Evaluator
    {
        public static EvaluatorResult Run(string input)
        {
            ICharStream characters = CharStreams.fromString(input);
            ITokenSource lexer = new LentoLexer(characters);
            ITokenStream tokens = new CommonTokenStream(lexer);
            LentoParser parser = new LentoParser(tokens)
            {
                BuildParseTree = true
            };

            try
            {
                IParseTree tree = parser.root();
                var value = 0;

                return new EvaluatorResult
                {
                    Succeeded = true,
                    Value = value,
                    Remaining = characters.GetText(Interval.Of(characters.Index, characters.Size)),
                    ParsedExpression = tree
                };
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                return new EvaluatorResult
                {
                    Succeeded = false,
                    ErrorMessage = e.Message,
                    Remaining = characters.GetText(Interval.Of(characters.Index, characters.Size))
                };
            }
        }
    }
}
