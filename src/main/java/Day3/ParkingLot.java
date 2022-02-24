package Day3;

import java.util.HashSet;
import java.util.Set;

public class ParkingLot {

    private final int capacity;
    private final Set<Car> carsParked = new HashSet<>();
    private final UsageService usageService;

    public ParkingLot(int capacity, UsageService usageService) {
        this.capacity = capacity;
        this.usageService = usageService;
    }

    public boolean hasSpace() {
        return carsParked.size() < capacity;
    }


    public void park(Car car) {
        carsParked.add(car);
        usageService.manageUsage(this);
    }

    public int getCapacity() {
        return capacity;
    }

    public Set<Car> getCarsParked() {
        return carsParked;
    }

    public void parkOut(Car car) {
        carsParked.remove(car);
        usageService.manageUsage(this);
    }
}
