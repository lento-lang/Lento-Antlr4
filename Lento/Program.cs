using System;
using System.Linq;
using LentoCore.Evaluator;
using LentoCore.Model;
using LentoCore.Parser;
using LentoCore.Tokenizer;
using Superpower.Model;
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
                    try
                    {
                        Result<TokenList<LentoToken>> tokenizeResult = Tokenizer.Instance.TryTokenize(expr);
                        if (tokenizeResult.HasValue)
                        {
                            foreach (Token<LentoToken> token in tokenizeResult.Value) Console.WriteLine(token.ToString());
                        }
                        else
                        {
                            Console.WriteLine(tokenizeResult.FormatErrorMessageFragment(), ConsoleColor.Red);
                        }
                    }
                    catch (Exception e)
                    {
                        Console.WriteLine(e.Message, ConsoleColor.Red);
                    }

                    /*
                    EvaluatorResult result = Evaluator.Run(expr);
                    if (result.Succeeded)
                    {
                        Console.WriteLine($"{result.Value}");
                        Console.WriteLine($"Remaining ({result.Remaining.Count()}): {result.Remaining}", ConsoleColor.DarkGray);
                    }
                    else Console.WriteLine(result.ErrorMessage, ConsoleColor.Red);
                    */
                }
            }
        }
    }
}
