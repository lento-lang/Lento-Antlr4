using System;
using System.Collections.Generic;
using System.Text;

namespace LentoCore.Data
{
    public class ParserResult
    {
        public AST AST;
        public bool Success;
        public string ErrorMessage;

        public static ParserResult Successful(AST ast) => new ParserResult {
            AST = ast,
            Success = true
        };
        public static ParserResult Failure(string message) => new ParserResult
        {
            Success = false,
            ErrorMessage = message
        };
    }
}
