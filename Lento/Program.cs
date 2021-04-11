using System;
using LentoCore.Parser;
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
                if (string.IsNullOrWhiteSpace(expr)) continue;
                APCSharp.Parser.PResult result = Parser.MatchParser.Run(expr);
                if (result.Success)
                {
                    Console.WriteLine(result.AST.ToString());

                    Console.WriteLine($"Remaining ({result.Remaining.Length / 2}): '{result.Remaining}'", ConsoleColor.DarkGray);
                }
                else Console.WriteLine(result.ErrorMessage, ConsoleColor.Red);
            }
        }
    }
}
