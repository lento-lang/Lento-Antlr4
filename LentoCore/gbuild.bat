@echo off
del Grammar\*.tokens
del Grammar\*.interp
del Grammar\*.cs
echo Compiling grammar...
java -jar "D:\Program Files (x86)\Antlr\antlr-4.9.2-complete.jar" -no-listener -visitor -Dlanguage=CSharp -package LentoCore.Parser Grammar\Lento.g4

echo Cleaning up unnecessary files
del Grammar\*.tokens
del Grammar\*.interp

pause