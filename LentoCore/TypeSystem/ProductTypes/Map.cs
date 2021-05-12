using System.Collections.Generic;

namespace LentoCore.TypeSystem.ProductTypes
{
    public class Map : LentoType
    {
        public Dictionary<string, LentoType> Elements { get; }

        public Map(string name, Dictionary<string, LentoType> elements) : base(name)
        {
            Elements = elements;
        }
    }
}
