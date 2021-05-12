using System;
using System.Collections.Generic;
using System.Text;
using LentoCore.Model;
using LentoCore.Parser;
using LentoCore.Tokenizer;
using Superpower.Model;

namespace LentoCore.Evaluator
{
    public class EvaluatorResult
    {
        public ExpressionValue Value;
        public bool Succeeded;
        public string ErrorMessage;
        public TokenList<LentoToken> Remaining;
        public Expression ParsedExpression;
    }
}
