using LentoCore.Model;
using Superpower;
using Superpower.Model;
using Superpower.Parsers;

namespace LentoCore.Parser
{

    public static class Parser
    {
        /*
        #region Parser Declarations

        #region Operators

        public static readonly TokenListParser<LentoToken, Expression>
            InfixOperator = Parse.Chain(Token.EqualTo(LentoToken.Operator).Value('+'), Parse.Ref(() => ExpressionParser), (c, expression, ) => );

        #endregion

        #region Identifier
        
        public static readonly TokenListParser<LentoToken, Expression> IdentifierParser = APCSharp.Parser.Parser.Word.FollowedBy(APCSharp.Parser.Parser.AnyOf(APCSharp.Parser.Parser.Word, APCSharp.Parser.Parser.Integer, APCSharp.Parser.Parser.Char('_')).ZeroOrMore().ListToString()).ListToString().InfoBinder("variable identifier");
        public static readonly TokenListParser<LentoToken, Expression> IgnoreIdentifierParser = APCSharp.Parser.Parser.Char('_').OneOrMore().ListToString().FollowedBy(APCSharp.Parser.Parser.AnyOf(IdentifierParser, APCSharp.Parser.Parser.Integer).ZeroOrMore()).ListToString().InfoBinder("'ignore' identifier"); // don't care

        #endregion

        #region Expression

        public static readonly TokenListParser<LentoToken, Expression> ParenthesesExpressionParser = APCSharp.Parser.Parser.Char('(')
            .IgnoredWhitespaces().FollowedBy(APCSharp.Parser.Parser.Ref(() => ExpressionParser).IgnoredWhitespaces())
            .FollowedBy(APCSharp.Parser.Parser.Char(')')).Flatten().InfoBinder("parentheses expression");
        
        public static readonly TokenListParser<LentoToken, Expression> ExpressionParser = APCSharp.Parser.Parser.AnyOf(
            ParenthesesExpressionParser,
            InfixOperator,
            APCSharp.Parser.Parser.Integer
        ).InfoBinder("expression");

        #endregion

        #region Match

        public static readonly TokenListParser<LentoToken, Expression> MatchIdentifierParser = IdentifierParser.Or(IgnoreIdentifierParser);
        public static readonly TokenListParser<LentoToken, Expression> MatchParser = MatchIdentifierParser.IgnoredWhitespaces().FollowedBy(EqualSignParser.IgnoredWhitespaces()).FollowedBy(ExpressionParser).InfoBinder("match expression");

        #endregion

        public static readonly TokenListParser<LentoToken, Expression> LentoParser = MatchParser;

        #endregion
        */
    }
}
