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



        map.FlightsMap().entrySet().stream()
                .filter(s -> s.getKey().equals(destination))
                .filter(f -> f.getValue().contains(by))
                .forEach(System.out::println);

    }

}

class FService {

    public static void main(String[] args) {

        FlightService flights = new FlightService();
        flights.flightsOut("Krakow");
        flights.flightsIn("Poznan");
        flights.flightsBy("Krakow","Szczecin");
    }

}