using System.Collections.Generic;
using System.Linq;

namespace LentoCore.TypeSystem.SumTypes
{
    public class TaggedUnion : LentoType
    {
        public Dictionary<string, LentoType> Types { get; }

        public TaggedUnion(string name, params LentoType[] types) : base(name)
        {
            Types = types.ToDictionary(t => t.Name);
        }
    }
}
