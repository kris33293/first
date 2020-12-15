package com.kodilla.good.patterns.challenges;


import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    public void flightsIn(String destination){

        FlightsMap map = new FlightsMap();

        map.FlightsMap().entrySet().stream()
                .filter(s -> s.getValue().contains(destination))
                .forEach(System.out::println);

    }

    public void flightsOut(String start){

        FlightsMap map = new FlightsMap();

        map.FlightsMap().entrySet().stream()
                .filter(s -> s.getKey().equals(start))
                .forEach(System.out::println);

    }

    public void flightsBy(String destination, String by){

        FlightsMap map = new FlightsMap();

        HashMap<String, List> listOfFlights = map.FlightsMap().entrySet().stream()
                .filter(s -> s.getKey().equals(by))

                .collect(toString());
    }

}

class FService {

    public static void main(String[] args) {

        FlightService flights = new FlightService();


        flights.flightsOut("Krakow");
        flights.flightsIn("Poznan");
    }

}