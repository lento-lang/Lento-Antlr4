using System.Collections.Generic;

namespace LentoCore.TypeSystem.ProductTypes
{
    public class Tuple : LentoType
    {
        public Dictionary<int, KeyValuePair<string, LentoType>> Elements { get; }

        public Tuple(string name, Dictionary<int, KeyValuePair<string, LentoType>> elements) : base(name)
        {
            Elements = elements;
        }
    }
}
