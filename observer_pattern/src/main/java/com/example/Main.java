package com.example;

import com.example.display.CurrentConditionsDisplay;
import com.example.display.ForecastDisplay;
import com.example.display.HeatIndexDisplay;
import com.example.display.StatisticsDisplay;
import com.example.sub.WeatherData;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay  statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndex = new HeatIndexDisplay(weatherData); 

        weatherData.setMeasurements(80, 65, 30.4f); 
        weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
    }
}