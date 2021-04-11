using System;
using APCSharp.Parser;
using LentoCore.Data;

namespace LentoCore.Parser
{
    public static class Parser
    {
        #region Combiner Declarations

        public static readonly Combiner FlattenCombiner = new Combiner((n1, n2) =>
        {
            Node result = Node.List();
            if (n1.Type == NodeType.List)
            {
                foreach (var node in n1.Children) result.Children.Add(node);
            }
            else if (n1.Type != NodeType.Empty) result.Children.Add(n1);
            if (n2.Type == NodeType.List)
            {
                foreach (var node in n2.Children) result.Children.Add(node);
            }
            else if (n2.Type != NodeType.Empty) result.Children.Add(n2);

            return result;
        });

        #endregion

        #region Parser Declarations

        #region Operators

        public static readonly ParserBuilder EqualSignParser = APCSharp.Parser.Parser.Char('=').InfoBinder("equal sign '='");

        #endregion
        
        public static readonly ParserBuilder ExpressionParser = APCSharp.Parser.Parser.Integer;

        public static readonly ParserBuilder IdentifierParser = APCSharp.Parser.Parser.Word.FollowedBy(APCSharp.Parser.Parser.AnyOf(APCSharp.Parser.Parser.Word, APCSharp.Parser.Parser.Integer, APCSharp.Parser.Parser.Char('_')).ZeroOrMore().ListToString()).ListToString().InfoBinder("variable identifier");
        public static readonly ParserBuilder IgnoreIdentifierParser = APCSharp.Parser.Parser.Char('_').OneOrMore().ListToString().FollowedBy(APCSharp.Parser.Parser.AnyOf(IdentifierParser, APCSharp.Parser.Parser.Integer).ZeroOrMore()).ListToString().InfoBinder("'ignore' identifier"); // don't care
        public static readonly ParserBuilder MatchIdentifierParser = IdentifierParser.Or(IgnoreIdentifierParser);

        public static readonly ParserBuilder MatchParser = MatchIdentifierParser.IgnoreAnyWhitespaces().FollowedBy(EqualSignParser)
            .IgnoreAnyWhitespaces().FollowedBy(ExpressionParser).Map(FlattenCombiner, NodeType.List).InfoBinder("match expression");

        public static readonly ParserBuilder LentoParser = APCSharp.Parser.Parser.AnyOf(
            MatchParser
        );
        
        #endregion
        
        public static PResult ParseRaw(string code) => LentoParser.Run(code);
        public static ParserResult Parse(string code) => Traverse(ParseRaw(code));

        private static ParserResult Traverse(PResult parseResult)
        {
            if (!parseResult.Success) return ParserResult.Failure(parseResult.ErrorMessage);
            AST root = new AST();
            // Transform the parse result to an Lento AST


            return ParserResult.Successful(root);
        }
    }
}
