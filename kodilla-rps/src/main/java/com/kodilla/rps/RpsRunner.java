package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        game.setUserName();

        System.out.println("Hello, " + game.getUserName() + " Let's play Rock, Paper, Scissors!\n" +
                "Rock = 1, Paper = 2, and Scissors = 3.\n" +
                "To end the game press x.\n" +
                "To start a new game press n");

        System.out.println("Please enter the number of rounds.");

        int rounds = scanner.nextInt();
        while(game.getRoundNo()< rounds) {
            game.rpsGame(); }
        game.finishGame();

    }
}
