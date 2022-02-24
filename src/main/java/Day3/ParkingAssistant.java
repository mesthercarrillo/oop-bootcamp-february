package Day3;

import java.util.Comparator;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.Comparator.comparingDouble;

public class ParkingAssistant {

    private static final int PARKING_CAPACITY_RATE = 80;
    private final Set<ParkingLot> parkingLots;
    private final UsageService usageService;

    public ParkingAssistant(Set<ParkingLot> parkingLots, UsageService usageService) {
        this.parkingLots = parkingLots;
        this.usageService = usageService;
    }

    public ParkingLot parkInFirstParkingLotAvailable(Car car) {
        var parkingLotStream = parkingLots.stream()
            .filter(this::hasTheParkingLotCapacity);
        if (car.isLarge()) {
            return parkingLotStream
                .min(comparingDouble(ParkingLot::calculateCurrentRate))
                .map(parkingLot -> {
                parkingLot.park(car);
                return parkingLot;
            }).orElse(null);
        }
        return parkingLotStream
            .findFirst()
            .map(parkingLot -> {
                parkingLot.park(car);
                return parkingLot;
            }).orElse(null);
    }

    private boolean hasTheParkingLotCapacity(ParkingLot parkingLot) {
        return usageService.checkCapacityRateLessThan(parkingLot, PARKING_CAPACITY_RATE);
    }

    public void addParkingLot(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }
}
