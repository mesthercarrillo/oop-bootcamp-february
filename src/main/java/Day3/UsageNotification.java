package Day3;

public class UsageNotification {

    public Object sendNotification(double capacity) {
        return String.format("Parking Usage is at %d%%", capacity);
    }
}
