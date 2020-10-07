package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumbersExterminator {
    public List<Integer> numbersList = new ArrayList<>();
    public List<Integer> afterExtermination = new ArrayList<>();

    public List<Integer> exterminate(List<Integer> numbersList) {
        this.numbersList = numbersList;

        for (Integer numbers : numbersList){
            if (numbers % 2 == 0){
                afterExtermination.add(numbers);
            }
        } return afterExtermination;
    }
}
