package initial;

public class CurrentConditionDisplay implements Display{
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("CurrentConditionDisplay update");
    }
}
