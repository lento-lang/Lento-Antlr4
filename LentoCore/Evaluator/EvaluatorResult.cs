using Antlr4.Runtime.Tree;

namespace LentoCore.Evaluator
{
    public class EvaluatorResult
    {
        public dynamic Value; // TODO: Add actual value type
        public bool Succeeded;
        public string ErrorMessage;
        public string Remaining;
        public IParseTree ParsedExpression;
    }
}
