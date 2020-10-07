package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int a = 5;
        int b= 2;
        int add = a + b;
        int sub = a - b;

        Calculator calc = new Calculator();

        int calcadd = calc.add(a,b);
        int calcsubs = calc.substract(a,b);

        if (add == calcadd){
            System.out.println("test dodawania OK");
        } else {
            System.out.println("Blad przy tescie dodawania!");
        }

        if (sub== calcsubs){
            System.out.println("test odejmowania OK");
        } else {
            System.out.println("Blad przy tescie odejmowania!");
        }

    }
}

