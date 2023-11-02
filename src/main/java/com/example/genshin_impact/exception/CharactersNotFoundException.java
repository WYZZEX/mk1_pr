package com.example.genshin_impact.exception;

public class CharactersNotFoundException extends RuntimeException {
    public CharactersNotFoundException(String message) {
        super(message);
    }
}