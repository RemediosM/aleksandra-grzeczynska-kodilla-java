package com.kodilla.rps;

import java.util.Scanner;

public class User {
    private Scanner scanner = new Scanner(System.in);
    private String name;
    ScoreBoard scoreBoard = new ScoreBoard();
    //Game game = new Game();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void askName(){
        System.out.println("Enter your name");
        name = scanner.next();
    }

    public Rps userMove() {
        System.out.println("Please enter a move.\n" );
        String  input = scanner.next();
        Rps userMove = null;

        while (userMove == null) {
            userMove = Rps.parseType(input);
            if (userMove == null) {
                System.out.println("Invalid entry. Try again.");
            } else {
                scoreBoard.addPlayerMove(userMove);
            }
        }
        return userMove;
    }

    public boolean newGame(Rps input){
        return input == Rps.NEW;

    }

    public boolean exitGame(Rps input) {
        return input == Rps.EXIT;
    }

}
