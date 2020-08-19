package observerPattern.weatherMonitoringExample.usingJavaLibraries.weather;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    /**
     * Using Observable methods
     */
    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    /**
     * Set new measurements
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
