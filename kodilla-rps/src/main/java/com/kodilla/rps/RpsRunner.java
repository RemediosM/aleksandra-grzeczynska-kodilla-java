package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        Game game = new Game();
        game.setUserName();

        System.out.println("Hello, " + game.getUserName() + " Let's play Rock, Paper, Scissors!\n" +
                "Rock = 1, Paper = 2, and Scissors = 3.\n" +
                "To end the game press x.\n" +
                "To start a new game press n");

        game.rpsGame();

    }
}
