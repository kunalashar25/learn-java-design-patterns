package observerPattern.weatherMonitoringExample.customObserverPattern.run;

import observerPattern.weatherMonitoringExample.customObserverPattern.displayData.CurrentConditionsDisplay;
import observerPattern.weatherMonitoringExample.customObserverPattern.displayData.ForecastDisplay;
import observerPattern.weatherMonitoringExample.customObserverPattern.displayData.StatisticsDisplay;
import observerPattern.weatherMonitoringExample.customObserverPattern.weather.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // setting first update
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("------------------------------------------------------------------");

        // removing statistics from observer list before second update
        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMeasurements(90, 25, 80.4f);
        System.out.println("------------------------------------------------------------------");

        // removing forecast from observer list before third update
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(130, 95, 112.4f);
        System.out.println("------------------------------------------------------------------");

        // adding statistics again
        weatherData.registerObserver(statisticsDisplay);
        weatherData.setMeasurements(110, 85.26f, 130.4f);
    }
}
