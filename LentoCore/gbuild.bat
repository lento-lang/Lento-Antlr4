@echo off
:start
cls
del Grammar\*.cs
echo Compiling grammar . . .
echo.

java -jar "D:\Program Files (x86)\Antlr\antlr-4.9.2-complete.jar" -no-listener -visitor -Dlanguage=CSharp -package LentoCore.Parser Grammar\LentoLexer.g4 Grammar\LentoParser.g4

echo.
echo Cleaning up unnecessary files . . .
del Grammar\*.tokens
del Grammar\*.interp

pause
goto start