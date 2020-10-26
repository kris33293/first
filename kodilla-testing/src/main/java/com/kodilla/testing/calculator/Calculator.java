package com.kodilla.testing.calculator;

public class Calculator {
    private int a, b;

    public int add(int a, int b) {
        this.a = a;
        this.b = b;
        return a + b;
    }

    public int substract(int a, int b) {
        this.a = a;
        this.b = b;
        return a - b;
    }
}
