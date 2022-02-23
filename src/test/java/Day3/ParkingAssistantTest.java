package Day3;

import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertEquals;

public class ParkingAssistantTest {

    @Test
    public void itShouldParkACarInTheFirstParkingLotAvailable() {
        var parkingLot = new ParkingLot();
        var assistant = new ParkingAssistant(Set.of(parkingLot));
        var car = new Car();
        var selectedParking = assistant.parkInFirstParkingLotAvailable(car);
        assertEquals(selectedParking, parkingLot);
    }
}
