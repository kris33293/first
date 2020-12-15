package com.kodilla.good.patterns.challenges;


import java.util.HashMap;

public class FlightService {

    public void flightsIn(String start){

        FlightsMap map = new FlightsMap();

        map.FlightsMap().entrySet().stream()
                .filter(s -> s.getKey().equals(start))
                .forEach(System.out::println);

    }

    public void flightsOut(FlightsMap map, String destination){

    }

    public void flightsBy(FlightsMap map, String destination){

    }

}

class FService {

    public static void main(String[] args) {

        FlightService flights = new FlightService();




        flights.flightsIn("Poznan");
    }

}