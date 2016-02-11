package com.company;


public class Parser {
    private Lexer myLexer;
    private Token currToken;

    //Constructor
    private Parser() {
        myLexer = new Lexer();
        currToken = new Token("", TokenCode.ERROR);
    }

    // Initiate the parse. Should be the only public method.
    public void parse() {
        Statements();
    }

    private void Statements() {
        
    }
}

