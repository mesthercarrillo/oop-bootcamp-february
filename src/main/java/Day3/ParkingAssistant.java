package Day3;

import java.util.Set;

public class ParkingAssistant {

    private final Set<ParkingLot> parkingLots;

    public ParkingAssistant(Set<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public ParkingLot parkInFirstParkingLotAvailable(Car car) {
        return parkingLots.stream().filter(ParkingLot::hasSpace).findFirst().get();
    }
}
