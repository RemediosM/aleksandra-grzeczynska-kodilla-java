package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard {
    private int roundNo = 0;
    private int playerScore = 0;
    private int computerScore = 0;
    private List<Rps> playerMoves = new ArrayList<>();
    private List<Rps> computerMoves = new ArrayList<>();



    @Override
    public String toString() {
        return "ScoreBoard{" +
                "round number: " + roundNo +
                ", player score = " + playerScore +
                ", computer score = " + computerScore +
                ", player moves = " + playerMoves +
                ", computer moves = " + computerMoves +
                '}';
    }

    public int addPlayerScore(){
        return playerScore++;
    }

    public int addComputerScore(){
        return computerScore++;
    }

    public void addPlayerMove(Rps move){
            playerMoves.add(move);
    }

    public void addComputerMove(Rps move){
        computerMoves.add(move);
    }

    public void setRoundNo(int roundNo) {
        this.roundNo = roundNo;
    }

    public  void clearBoard(){
        roundNo = 0;
        playerScore = 0;
        computerScore = 0;
        playerMoves.clear();
        computerMoves.clear();
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void nextRound(){
        roundNo++;
    }

    public int getRoundNo() {
        return roundNo;
    }
}
