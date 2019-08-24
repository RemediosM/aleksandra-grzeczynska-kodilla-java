package com.kodilla.rps;


import java.util.Scanner;

public class Game {

    private ScoreBoard scoreBoard = new ScoreBoard();
    private User user = new User();
    private Computer computer = new Computer();
    Scanner scanner = new Scanner(System.in);


    public void rpsGame() {
        System.out.println("Please enter the number of rounds.");
        int rounds = scanner.nextInt();

        while(scoreBoard.getRoundNo()< rounds) {
            Rps userMove = user.userMove();
            if (user.newGame(userMove)) {
                System.out.println("Are you sure you want to start a new game? yes/no");
                String input = scanner.next();
                if (input.equals("yes")) {
                    System.out.println("The new game begins...");
                    scoreBoard.clearBoard();
                    rpsGame();

                } else {
                    System.out.println("Continue the game");
                }
            }

            if (user.exitGame(userMove)) {
                System.out.println("Are you sure you want to exit the game? yes/no");
                String input = scanner.next();
                if (input.equals("yes")) {
                    System.out.println("The game is over");
                    System.exit(0);
                } else {
                    System.out.println("Continue the game");
                }
            }
            scoreBoard.addPlayerMove(userMove);
            Rps computerMove = computer.computerMove();
            scoreBoard.addComputerMove(computerMove);


            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie.");
            } else if (userMove.beats(computerMove)) {
                System.out.println(userMove + " beats " + computerMove + ". You win!");
                scoreBoard.addPlayerScore();
            } else {
                System.out.println(computerMove + " beats " + userMove + ". You lose :(");
                scoreBoard.addComputerScore();
            }
            System.out.println(scoreBoard.toString());
            scoreBoard.nextRound();

        }
        finishGame();

    }
    public void finishGame(){
        if(scoreBoard.getComputerScore() > scoreBoard.getPlayerScore()){
            System.out.println("The winner is Computer. You lost :(");
        } else if (scoreBoard.getComputerScore() < scoreBoard.getPlayerScore()) {
            System.out.println("The winner is Player. Congratulation!");
        } else {
            System.out.println("Nobody wins. It's a tie.");
        }
        System.out.println("Press n to start new game. Press x to exit");
        int x =0;

        do  {
            String input = scanner.next();
            if (input.equals("n")) {
                System.out.println("The new game begins...");
                scoreBoard.clearBoard();
                rpsGame();
            } else if (input.equals("x")) {
                System.out.println("Exit");
            }else {
                System.out.printf("Press x or n");
                x=3;

        } }while (x !=0);
    }

    public void setUserName(){
        user.askName();
    }

    public String getUserName(){
        return user.getName();
    }
}
