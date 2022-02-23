package Day3;

import java.util.HashSet;
import java.util.Set;

public class ParkingLot {

    private final int capacity;
    private final Set<Car> carsParked = new HashSet<>();
    private final OverUsageNotification notification;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.notification = new OverUsageNotification();
    }

    public boolean hasSpace() {
        return carsParked.size() < capacity;
    }

    public Set<Car> getCarsParked() {
        return carsParked;
    }

    public void park(Car car) {
        carsParked.add(car);
    }

    public boolean checkCapacityRate(int rate) {
        return getCurrentRate() <= rate;
    }

    private int getCurrentRate() {
        return carsParked.size() * 100 / capacity;
    }

}
