package com.kodilla.good.patterns.challenges;


import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    public void flightsIn(String destination) {

        FlightsMap map = new FlightsMap();


        map.FlightsMap().stream()
                .filter(s -> s.getDepartureAirport().equals(destination))
                .forEach(System.out::println);

    }

    public void flightsOut(String start) {

        FlightsMap map = new FlightsMap();

        map.FlightsMap().stream()
                .filter(s -> s.getStartAirport().equals(start))
                .forEach(System.out::println);

    }

    public void flightsBy(String destination, String by) {

        FlightsMap map = new FlightsMap();


        map.FlightsMap().stream()
                .filter(s -> s.getDepartureAirport().equals(destination))
                .filter(f -> f.getStartAirport().equals(by))
                .forEach(System.out::println);

    }

}

class FService {

    public static void main(String[] args) {

        FlightService flights = new FlightService();
        flights.flightsOut("Poznan");
        System.out.println();
        flights.flightsIn("Poznan");
        System.out.println();
        flights.flightsBy("Berlin", "Krakow");
    }

}