using System;
using System.Collections.Generic;
using System.Text;

namespace LentoCore.TypeSystem
{
    public abstract class LentoType : IFormattable
    {
        protected LentoType(string name)
        {
            Name = name;
        }

        public string Name { get; }

        public virtual string ToString(string format, IFormatProvider formatProvider) => $"({GetType().Name}) {Name}";
    }
}
