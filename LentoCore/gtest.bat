@echo off

cd Grammar
:loop
cls
echo Compiling grammar . . .
java -jar "D:\Program Files (x86)\Antlr\antlr-4.9.2-complete.jar" -no-listener -visitor LentoLexer.g4 LentoParser.g4
javac LentoLexer.java
javac LentoParser.java

cls
echo Input (ending ^^Z):

java org.antlr.v4.gui.TestRig Lento compilation_unit -gui

echo.

echo Cleaning up unnecessary files . . .
del *.tokens
del *.interp
del *.java
del *.class

goto loop