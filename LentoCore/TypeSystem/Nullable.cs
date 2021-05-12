using System;
using System.Collections.Generic;
using System.Text;

namespace LentoCore.TypeSystem
{
    public class Nullable<T> : LentoType
    {
        public T Type { get; }

        public Nullable(string name, T type) : base(name)
        {
            Type = type;
        }
    }
}
