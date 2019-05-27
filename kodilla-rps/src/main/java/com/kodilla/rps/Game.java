package com.kodilla.rps;


import java.util.Scanner;

public class Game {

    private ScoreBoard scoreBoard = new ScoreBoard();
    private User user = new User();
    private Computer computer = new Computer();
    Scanner scanner = new Scanner(System.in);


    public void rpsGame() {

        Rps userMove = user.userMove();

        if (user.newGame(userMove)) {
            System.out.println("Are you sure you want to start a new game?");
            String input = scanner.next();
            if (input.equals("yes")) {
                System.out.println("The new game begins...");
                scoreBoard.clearBoard();
                rpsGame();

            } else {
                System.out.println("Continue the game");
                rpsGame();
            }
        }

        if (user.exitGame(userMove)) {
            System.out.println("Are you sure you want to exit the game?");
            String input = scanner.next();
            if (input.equals("yes")) {
                System.out.println("The game is over");
                System.exit(0);
            } else {
                System.out.println("Continue the game");
                rpsGame();
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
            scoreBoard.nextRound();
            System.out.println(scoreBoard.toString());

    }

    public void finishGame(){
        if(scoreBoard.getComputerScore() > scoreBoard.getPlayerScore()){
            System.out.println("The winner is Computer. You're looser!");
        } else if (scoreBoard.getComputerScore() < scoreBoard.getPlayerScore()) {
            System.out.println("The winner is Player. Congratulation!");
        } else {
            System.out.println("Nobody wins. It's a tie.");
        }
    }

    public int getRoundNo(){
        return scoreBoard.getRoundNo();
    }

    public void setUserName(){
        user.askName();
    }

    public String getUserName(){
        return user.getName();
    }
}
