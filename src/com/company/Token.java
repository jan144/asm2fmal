package com.company;

enum TokenCode { ID, ASSIGN, SEMICOL, INT, PLUS, MINUS,
                 MULT, LPAREN, RPAREN, PRINT, END, ERROR}

public class Token {
    String lexeme;
    TokenCode tCode;

    public Token(String l, TokenCode t) {
        this.lexeme = l;
        this.tCode = t;
    }

}