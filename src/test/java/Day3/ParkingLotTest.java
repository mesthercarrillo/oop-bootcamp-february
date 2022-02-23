package Day3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ParkingLotTest {
    @Test
    public void itShouldCheckIfHasSpace() {
        var parkingLot = new ParkingLot();
        assertTrue(parkingLot.hasSpace());
    }

    @Test
    public void itShouldIfNotHasSpace() {
        var parkingLot = new ParkingLot();
        var car = new Car();
        parkingLot.park(car);
        assertFalse(parkingLot.hasSpace());
    }

    @Test
    public void itShouldParkACar() {
        var parkingLot = new ParkingLot();
        var car = new Car();
        parkingLot.park(car);
        assertEquals(parkingLot.getCarsParked().size(), 1);

    }

    @Test
    public void itShouldCheckCapacityRate() {
        var parkingLot = new ParkingLot();
        assertTrue(parkingLot.checkCapacityRate(80));
    }
}