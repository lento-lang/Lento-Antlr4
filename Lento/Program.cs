using System;
using LentoCore.Evaluator;
using Console = EzConsole.EzConsole;

namespace LentoInterpreter
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.Write("LI> "); 
                var expr = Console.ReadLine();
                if (!string.IsNullOrWhiteSpace(expr))
                {
                    EvaluatorResult result = Evaluator.Run(expr);
                    if (result.Succeeded)
                    {
                        Console.WriteLine($"{result.Value}");
                        Console.WriteLine($"Remaining ({result.Remaining.Length}): {result.Remaining}", ConsoleColor.DarkGray);
                    }
                    else Console.WriteLine(result.ErrorMessage, ConsoleColor.Red);
                }
            }
        }
    }
}
