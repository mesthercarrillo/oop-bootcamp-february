package Day3;

import java.util.Set;

public class ParkingAssistant {

    public static final int PARKING_CAPACITY_RATE = 80;
    private final Set<ParkingLot> parkingLots;

    public ParkingAssistant(Set<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public ParkingLot parkInFirstParkingLotAvailable(Car car) {
        return parkingLots.stream()
            .filter(ParkingLot::hasSpace)
            .filter(parkingLot -> parkingLot.checkCapacityRate(PARKING_CAPACITY_RATE))
            .peek(parkingLot -> parkingLot.park(car))
            .findFirst()
            .get();
    }
}
