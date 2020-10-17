package com.kodilla.stream.beautifier;

import com.kodilla.stream.beautifier.PoemDecorator;

public class PoemBeautifer {

    public void ExecuteBeautifer(String a,String b,PoemDecorator poemDecorator) {
        String result = poemDecorator.beautify(a,b);
        System.out.println("Rezultat: " + result);
    }
}
