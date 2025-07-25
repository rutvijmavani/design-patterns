package com.example.display;

import com.example.obs.Observer;
import com.example.sub.WeatherData;

public class ForecastDisplay implements  DisplayElement , Observer {
    private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

    @Override
	public void update() {
        lastPressure = currentPressure;
		currentPressure = weatherData.getPressure();

		display();
	}

    @Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
