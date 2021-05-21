package initial;

import lombok.Getter;

import java.util.List;

@Getter
public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;

    private List<Display> displayList;



    public void measurementsChanged() {
        notifyDisplays();
    }

    @Override
    public void registerDisplay(Display d) {
        displayList.add(d);
    }

    @Override
    public void removeDisplay(Display d) {
        displayList.remove(d);
    }

    @Override
    public void notifyDisplays() {
        displayList.forEach( i -> i.update(temperature, humidity, pressure) );
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
