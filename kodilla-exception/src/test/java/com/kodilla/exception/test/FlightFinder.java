package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public HashMap<String, Boolean> FlightMap() {
        HashMap<String, Boolean> flightsMap = new HashMap<>();
        flightsMap.put("Amsterdam", Boolean.TRUE);
        flightsMap.put("Berlin", Boolean.TRUE);
        flightsMap.put("Poznan", Boolean.FALSE);
        flightsMap.put("Dublin", Boolean.TRUE);
        flightsMap.put("Tokio", Boolean.FALSE);
        flightsMap.put("Warszawa", Boolean.TRUE);
        flightsMap.put("Porto", Boolean.TRUE);
        return flightsMap;
    }

    public void findFlight(Flight flight) throws Exception {

        if (FlightMap().containsKey(flight.getArrivalAirport()) & FlightMap().containsValue(Boolean.TRUE)) {
            System.out.println("Wyszukiwany Lot Istnieje");
        } else throw new RouteNotFoundException();
    }

    public static void main(String[] args) {
        FlightFinder flight = new FlightFinder();
        Flight searchedFlight = new Flight("Oslo","Berlin");
        try {
            flight.findFlight(searchedFlight);
        } catch (Exception e) {
            System.out.println("Wyszukiwany lot nie istnieje!");
        }
    }
}
