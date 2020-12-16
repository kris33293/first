package com.kodilla.good.patterns.challenges;

public class DepartureAirport {

    private String name;

    public DepartureAirport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DepartureAirport{" +
                "name='" + name + '\'' +
                '}';
    }
}
