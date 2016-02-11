package com.company;

public class Compiler {
    public static void main(String[] args) {
        Lexer myLexer = new Lexer();
        //Parser myParser = new Parser(myLexer);
        //myParser.parse();
        while(true){
            Token tooken = myLexer.nextToken();
            System.out.println(tooken.tCode);
        }

    }
}