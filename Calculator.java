package com.oleg.calculator;

public class Calculator {

    private double currentNumber;
    private boolean numberSet = false;

    public Calculator() {
        currentNumber = 0;
    }

    public void startCalculation(double firstNumber) {
        currentNumber = firstNumber;
        numberSet = true;
    }

    public void processCommand(Operator operator, double secondNumber) {
        switch(operator) {
            case PLUS:
                add(secondNumber);
                break;
            case MINUS:
                subtract(secondNumber);
                break;
            case MULTIPLY:
                multiply(secondNumber);
                break;
            case DIVIDE:
                divide(secondNumber);
                break;
            case POWER:
                power(secondNumber);
                break;
            case EQUAL:
                currentNumber = secondNumber;
                break;
        }
    }

    public double getCurrentNumber() {
        return currentNumber;
    }

    public boolean isNumberSet() {
        return numberSet;
    }

    private void add(double number) {
        currentNumber += number;
    }

    private void subtract(double number) {
        currentNumber -= number;
    }

    private void multiply(double number) {
        currentNumber *= number;
    }

    private void divide(double number) {
        currentNumber /= number;
    }

    private void power(double number) {
        currentNumber = Math.pow(currentNumber, number);
    }
    
}
