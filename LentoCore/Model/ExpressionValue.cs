using System;
using System.Collections.Generic;
using System.Text;
using LentoCore.TypeSystem;

namespace LentoCore.Model
{
    public class ExpressionValue : IFormattable
    {
        public ValueType Type;
        public LentoType UserType;
        public IFormattable Value;
        public override string ToString() => $"({(Type == ValueType.UserType ? UserType.ToString() : Type.ToString())}) {Value}";
        public string ToString(string format, IFormatProvider formatProvider) => ToString();
    }
    public enum ValueType
    {
        Corrupt,
        Void,
        Number,
        String,
        Struct,
        List,
        Map,
        Tuple,

        UserType    // Type defined in the program or in an imported module
    }
}
