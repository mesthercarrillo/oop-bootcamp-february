package Day3;

import java.util.HashSet;
import java.util.Set;

public class ParkingLot {

    private static final int PARKING_LOT_CAPACITY = 10;
    private final Set<Car> carsParked = new HashSet<>();

    public boolean hasSpace() {
        return carsParked.size() < PARKING_LOT_CAPACITY;
    }

    public Set<Car> getCarsParked() {
        return carsParked;
    }

    public void park(Car car) {
        carsParked.add(car);
    }

    public boolean checkCapacityRate(int rate) {
      return (PARKING_LOT_CAPACITY * 0.8 <= rate);
    }

}
