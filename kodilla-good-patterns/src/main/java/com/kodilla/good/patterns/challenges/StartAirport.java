package com.kodilla.good.patterns.challenges;

public class StartAirport {

    private String name;

    public StartAirport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StartAirport{" +
                "name='" + name + '\'' +
                '}';
    }
}
