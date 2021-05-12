using System.Collections.Generic;

namespace LentoCore.TypeSystem.ProductTypes
{
    public class Class : LentoType
    {
        public Dictionary<string, LentoType> Fields { get; }

        public Class(string name, Dictionary<string, LentoType> fields) : base(name)
        {
            Fields = fields;
        }
    }
}
