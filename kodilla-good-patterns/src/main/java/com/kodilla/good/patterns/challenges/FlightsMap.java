package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightsMap {

    private static HashMap<String,List> listOfFlights = new HashMap<>();

    public HashMap<String, List> FlightsMap(){

        List<String> krakowFlights = new ArrayList<>();
        krakowFlights.add("Poznan");
        krakowFlights.add("Warszawa");
        krakowFlights.add("Szczecin");

        List<String> szczecinFlights = new ArrayList<>();
        szczecinFlights.add("Poznan");
        szczecinFlights.add("Krakow");

        List<String> poznanFlights = new ArrayList<>();
        poznanFlights.add("Rzeszow");
        poznanFlights.add("Berlin");
        poznanFlights.add("Szczecin");
        poznanFlights.add("Gdynia");
        poznanFlights.add("Bydgoszcz");

        listOfFlights.put("Krakow",krakowFlights);
        listOfFlights.put("Szczecin",szczecinFlights);
        listOfFlights.put("Poznan", poznanFlights);
        return listOfFlights;
    }


}
