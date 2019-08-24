package com.kodilla.rps;

import java.util.Random;

public class Computer {

    public Rps computerMove(){
        Random random = new Random();
        int input = random.nextInt(3) + 1;
        Rps computer = null;

        while(computer == null) {
            System.out.println("Computer plays...");
            computer = Rps.parseType(Integer.toString(input));
        }
        return computer;
    }

}
