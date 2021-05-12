using System;
using System.Collections.Generic;
using System.Text;

namespace LentoCore.Model
{
    public abstract class Expression : System.Linq.Expressions.Expression
    {
        public abstract ExpressionValue Evaluate();
    }
}
