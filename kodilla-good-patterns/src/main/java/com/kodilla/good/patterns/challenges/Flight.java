package com.kodilla.good.patterns.challenges;

public class Flight {

    StartAirport startAirport;
    DepartureAirport departureAirport;

    public Flight(StartAirport startAirport, DepartureAirport departureAirport) {
        this.startAirport = startAirport;
        this.departureAirport = departureAirport;
    }

    public StartAirport getStartAirport() {
        return startAirport;
    }

    public DepartureAirport getDepartureAirport() {
        return departureAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "startAirport=" + startAirport +
                ", departureAirport=" + departureAirport +
                '}';
    }
}