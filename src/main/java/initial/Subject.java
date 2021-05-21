package initial;

public interface Subject {
    public void registerDisplay(Display d);
    public void removeDisplay(Display d);
    public void notifyDisplays();
}
