package com.kodilla.rps;

public enum Rps {
    ROCK, PAPER, SCISSORS, EXIT, NEW;

    public static Rps parseType(String value){
        switch (value) {
            case "1": return ROCK;
            case "2": return PAPER;
            case "3": return SCISSORS;
            case "x": return EXIT;
            case "n": return NEW;
            default: return null;
        }
    }
    public boolean beats(Rps antagonist){
        switch (this) {
            case ROCK: return antagonist == SCISSORS;
            case PAPER: return antagonist == ROCK;
            case SCISSORS: return antagonist == PAPER;
            default: return false;
        }
    }
}
