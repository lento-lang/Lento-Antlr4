using System;
using System.Collections.Generic;
using System.Text;

namespace LentoCore.Model
{
    public enum LentoToken
    {
        Number,
        FormattedNumber, // Like 100101b or 0x123
        String,
        
        Assignment,
        Operator,

        Keyword,
        Identifier,
        IgnoreIdentifier,

        LBracket,
        RBracket,
        LParen,
        RParen,
        SemiColon
    }
}
