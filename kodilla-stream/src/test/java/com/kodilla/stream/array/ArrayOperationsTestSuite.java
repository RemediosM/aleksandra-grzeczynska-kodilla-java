package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAvarage() {
        //Given
        int[] numbers = new int[20];

        //When
        for(int i = 0; i < 20; i++){
            numbers[i] = (i + 4)*3;
        }
        double expectAvg = 40.5;

        //Then
        Assert.assertEquals(expectAvg,ArrayOperations.getAvarage(numbers), 0.1);
    }
}
