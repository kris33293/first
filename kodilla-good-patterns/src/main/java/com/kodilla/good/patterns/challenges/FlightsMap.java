package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class FlightsMap {

    private static HashMap<String,String> listOfFlights = new HashMap<>();

    public HashMap<String,String> FlightsMap(){

        listOfFlights.put("Krakow","Poznan");
        listOfFlights.put("Krakow","Warszawa");
        listOfFlights.put("Krakow","Szczecin");
        listOfFlights.put("Szczecin","Poznan");
        listOfFlights.put("Szczecin","Krakow");
        listOfFlights.put("Poznan","Szczecin");
        listOfFlights.put("Poznan","Rzeszow");
        listOfFlights.put("Poznan","Bydgoszcz");
        listOfFlights.put("Poznan","Gdynia");
        listOfFlights.put("Poznan","Berlin");
        listOfFlights.put("Gdynia","Rzeszow");
        listOfFlights.put("Berlin","Dublin");
        return listOfFlights;
    }


}
