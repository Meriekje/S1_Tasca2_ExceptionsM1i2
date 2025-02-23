package org.example.nivell1;

public class EmptySaleException extends Exception {
    public EmptySaleException() {
        super("To make a sale, products must be added first");
    }
}
