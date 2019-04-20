package com.kodilla.testing;
import calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calculatorAdd = new Calculator();

        int result = calculatorAdd.add(254, 569);

        if(result == 823) {
            System.out.println("First test OK");
        } else {
            System.out.println("First test error");
        }

        Calculator calculatorSub = new Calculator();

        result = calculatorSub.substract(569, 823);

        if(result == -254) {
            System.out.println("Second test OK");
        } else {
            System.out.println("Second test error");
        }
    }
}
