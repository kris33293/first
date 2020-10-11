package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        Map<String, Double> resultMap = new HashMap<>();
        List<Double> temperaturesList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){


            resultMap.put(temperature.getKey(), temperature.getValue());
        }

        for (Map.Entry<String, Double> temperature :
                resultMap.entrySet()){


            temperaturesList.add(temperature.getValue());
        }

        int n = temperaturesList.size();
        double averageTemp = 0;
        for (int i=0; i<n; i++){
            averageTemp = averageTemp + temperaturesList.get(i);
        }

        return (averageTemp / n );
    }

    public double calculateMedianTemperature() {
        Map<String, Double> resultMap = new HashMap<>();
        List<Double> temperaturesList = new ArrayList<>();
        double mediana = 0;
        double srednia = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){


            resultMap.put(temperature.getKey(), temperature.getValue());
        }

        for (Map.Entry<String, Double> temperature :
                resultMap.entrySet()){


            temperaturesList.add(temperature.getValue());
        }

        Collections.sort(temperaturesList);
            mediana = temperaturesList.get(temperaturesList.size()/2);


        return mediana;


    }
}
