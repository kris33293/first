package com.kodilla.good.patterns.challenges;

import java.util.*;

public class FlightsMap {

   Set<Flight> listOfFlights = new HashSet<>();

    public Set<Flight> FlightsMap() {

        StartAirport poznanS = new StartAirport("Poznan");
        StartAirport krakowS = new StartAirport("Krakow");
        StartAirport warszawaS = new StartAirport("Warszawa");
        StartAirport lodzS = new StartAirport("Lodz");


        DepartureAirport poznanD = new DepartureAirport("Poznan");
        DepartureAirport krakowD = new DepartureAirport("Krakow");
        DepartureAirport berlinD = new DepartureAirport("Berlin");
        DepartureAirport lodzD = new DepartureAirport("Lodz");

        Flight a1 = new Flight(poznanS,krakowD);
        Flight a2 = new Flight(poznanS,lodzD);
        Flight a3 = new Flight(krakowS,berlinD);
        Flight a4 = new Flight(warszawaS,poznanD);
        Flight a5 = new Flight(lodzS,krakowD);

        listOfFlights.add(a1);
        listOfFlights.add(a2);
        listOfFlights.add(a3);
        listOfFlights.add(a4);
        listOfFlights.add(a5);

        return listOfFlights;
    }


}
