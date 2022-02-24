package Day3;

import java.util.Set;

public class ParkingAssistant {

    private static final int PARKING_CAPACITY_RATE = 80;
    private final Set<ParkingLot> parkingLots;
    private final UsageService usageService;

    public ParkingAssistant(Set<ParkingLot> parkingLots, UsageService usageService) {
        this.parkingLots = parkingLots;
        this.usageService = usageService;
    }

    public ParkingLot parkInFirstParkingLotAvailable(Car car) {
        return parkingLots.stream()
            .filter(ParkingLot::hasSpace)
            .filter(parkingLot -> usageService.checkCapacityRateLessThan(parkingLot, PARKING_CAPACITY_RATE))
            .findFirst().map(parkingLot -> {
                parkingLot.park(car);
                return parkingLot;
            }).orElse(null);
    }

    public void addParkingLot(ParkingLot parkingLot){
        parkingLots.add(parkingLot);
    }
}
