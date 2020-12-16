package com.kodilla.good.patterns.challenges;

public class Flight {

    private StartAirport startAirport;
    private DepartureAirport departureAirport;

    public Flight(StartAirport startAirport, DepartureAirport departureAirport) {
        this.startAirport = startAirport;
        this.departureAirport = departureAirport;
    }


    public String getStartAirport() {
        return startAirport.getName();
    }

    public String getDepartureAirport() {
        return departureAirport.getName();
    }



    @Override
    public String toString() {
        return "Flight{" +
                "startAirport=" + startAirport +
                ", departureAirport=" + departureAirport +
                '}';
    }
}
