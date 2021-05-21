package initial;

public class ForecastDisplay implements Display {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Forecast Dispaly update");
    }
}
