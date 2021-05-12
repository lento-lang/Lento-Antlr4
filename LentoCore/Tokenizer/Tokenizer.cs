using System.Runtime.CompilerServices;
using LentoCore.Model;
using Superpower;
using Superpower.Model;
using Superpower.Parsers;
using Superpower.Tokenizers;

namespace LentoCore.Tokenizer
{
    public static class Tokenizer
    {
        private static readonly TextParser<Unit> Integer = 
            from digit in Character.Digit
            from rest in Character.Digit.IgnoreMany()
            select Unit.Value;

        private static readonly TextParser<Unit> Number =
            from sign in Character.EqualTo('-').OptionalOrDefault()
            from integer in Integer.OptionalOrDefault()
            from digits in
                (from dot in Character.EqualTo('.')
                from rest in Integer
                select Unit.Value).OptionalOrDefault()
            select Unit.Value;
        
        private static readonly TextParser<Unit> BinaryNumber =
            from first in Character.In('0', '1')
            from bits in Character.In('0','1').IgnoreMany()
            from suffix in Character.EqualTo('b') 
            select Unit.Value;
        private static readonly TextParser<Unit> HexNumber =
            from prefix in Span.EqualTo("0x")
            from value in Character.HexDigit.IgnoreMany()
            select Unit.Value;

        private static readonly TextParser<Unit> FormattedNumber = BinaryNumber.Or(HexNumber);

        private static readonly TextParser<Unit> String =
            from fq in Character.EqualTo('"')
            from value in Character.Except('"').IgnoreMany()
            from lq in Character.EqualTo('"')
            select value;

        private static readonly TextParser<Unit> Identifier =
            from first in Character.Letter
            from rest in Character.LetterOrDigit.Or(Character.In('_')).IgnoreMany()
            select Unit.Value;

        private static readonly TextParser<Unit> IgnoreIdentifier =
            from _ in Character.EqualTo('_')
            from n in Character.Digit.IgnoreMany().OptionalOrDefault()
            from id in Identifier.OptionalOrDefault()
            select Unit.Value;

        private static readonly TextParser<char> Operator = Character.In('+', '-', '*', '/');

        public static Tokenizer<LentoToken> Instance = new TokenizerBuilder<LentoToken>()
            .Ignore(Span.WhiteSpace)
            .Match(Character.EqualTo('{'), LentoToken.LBracket)
            .Match(Character.EqualTo('}'), LentoToken.RBracket)
            .Match(Character.EqualTo('='), LentoToken.Assignment)
            .Match(FormattedNumber, LentoToken.FormattedNumber, requireDelimiters: true)
            .Match(Operator, LentoToken.Operator)
            .Match(Identifier, LentoToken.Identifier)
            .Match(IgnoreIdentifier, LentoToken.IgnoreIdentifier)
            .Match(Number, LentoToken.Number, requireDelimiters: true)
            .Build();
    }
}
