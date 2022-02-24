package Day3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ParkingLot {

    private final int capacity;
    private final boolean handicapFriendly;
    private final Set<Car> carsParked = new HashSet<>();
    private final UsageService usageService;

    public ParkingLot(int capacity, boolean handicapFriendly, UsageService usageService) {
        this.capacity = capacity;
        this.handicapFriendly = handicapFriendly;
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

    public double calculateCurrentRate() {
        return (double) getCarsParked().size() * 100 / getCapacity();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParkingLot that = (ParkingLot) o;
        return capacity == that.capacity && Objects.equals(carsParked, that.carsParked) &&
            Objects.equals(usageService, that.usageService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, carsParked, usageService);
    }
}
