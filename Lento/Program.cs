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
                APCSharp.Parser.PResult result = Parser.ParseRaw(expr);
                if (result.Success)
                {
                    Console.WriteLine(result.ResultNode.ToString());
                    Console.WriteLine($"Remaining ({result.Remaining.Length}): '{result.Remaining}'", ConsoleColor.DarkGray);
                }
                else Console.WriteLine(result.ErrorMessage, ConsoleColor.Red);
            }
        }
    }
}
