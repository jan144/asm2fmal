package com.company;
import java.util.Scanner;

public class Lexer {
    private Scanner sc;

    //Constructor
    public Lexer() {
        sc = new Scanner(System.in);
    }

    public Token nextToken() {
        String next = sc.next();

        if (next.equals("=")) {
            return new Token(next, TokenCode.ASSIGN);
        }
        else if (next.equals(";")) {
            return new Token(next, TokenCode.SEMICOL);
        }
        else if (next.equals("+")) {
            return new Token(next, TokenCode.PLUS);
        }
        else if (next.equals("-")) {
            return new Token(next, TokenCode.MINUS);
        }
        else if (next.equals("*")) {
            return new Token(next, TokenCode.MULT);
        }
        else if (next.equals("(")) {
            return new Token(next, TokenCode.LPAREN);
        }
        else if (next.equals(")")) {
            return new Token(next, TokenCode.RPAREN);
        }
        else if (next.equals("print")) {
            return new Token(next, TokenCode.PRINT);
        }
        else if (next.equals("end")) {
            return new Token(next, TokenCode.END);
        }
        else if (next.matches("[0-9]+")) {
            return new Token(next, TokenCode.INT);
        }
        else if (next.matches("[A-Za-z]+")) {
            return new Token(next, TokenCode.ID);
        }
        else {
            return new Token("ERR", TokenCode.ERROR);
        }

    }

}

