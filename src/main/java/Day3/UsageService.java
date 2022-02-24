package Day3;

public class UsageService {

    UsageNotification usageNotification;

    public void manageUsage(ParkingLot parkingLot) {
        if (!checkCapacityRateLessThan(parkingLot, 75) || checkCapacityRateLessThan(parkingLot, 20)) {
            usageNotification.sendNotification(getCurrentRate(parkingLot));
        }
    }

    public boolean checkCapacityRateLessThan(ParkingLot parkingLot, double rate) {
        return getCurrentRate(parkingLot) <= rate;
    }

    public Double getCurrentRate(ParkingLot parkingLot) {
        return parkingLot.calculateCurrentRate();
    }

}
