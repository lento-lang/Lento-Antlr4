using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using LentoCore.Model;
using LentoCore.Parser;
using LentoCore.Tokenizer;
using Superpower;
using Superpower.Model;

namespace LentoCore.Evaluator
{
    public static class Evaluator
    {
        public static EvaluatorResult Run(string input)
        {
            TokenList<LentoToken> tokens = TokenList<LentoToken>.Empty;
            try
            {
                tokens = Tokenizer.Tokenizer.Instance.Tokenize(input);
                //Expression ast = Parser.Parser.LentoParser.Parse(tokens);
                //ExpressionValue value = ast.Evaluate();

                return new EvaluatorResult
                {
                    Succeeded = true,
                    Value = new ExpressionValue(), //value,
                    Remaining = tokens,
                    ParsedExpression = null, // ast
                };
            }
            catch (Exception e)
            {
                return new EvaluatorResult
                {
                    Succeeded = false,
                    ErrorMessage = e.Message,
                    Remaining = tokens
                };
            }
        }
    }
}
