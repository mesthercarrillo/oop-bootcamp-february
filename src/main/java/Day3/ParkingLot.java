package Day3;

import java.util.HashSet;
import java.util.Set;

public class ParkingLot {

    private final int capacity;
    private final Set<Car> carsParked = new HashSet<>();
    private final OverUsageNotification overUsageNotification;

    public ParkingLot(int capacity, OverUsageNotification overUsageNotification) {
        this.capacity = capacity;
        this.overUsageNotification = overUsageNotification;
    }

    public boolean hasSpace() {
        return carsParked.size() < capacity;
    }

    public Set<Car> getCarsParked() {
        return carsParked;
    }

    public void park(Car car) {
        carsParked.add(car);
        if (!checkCapacityRateLessThan(75)) {
            overUsageNotification.sendNotification();
        }
    }

    public boolean checkCapacityRateLessThan(int rate) {
        return getCurrentRate() <= rate;
    }

    private int getCurrentRate() {
        return carsParked.size() * 100 / capacity;
    }

}
