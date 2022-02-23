package Day3;

import org.mockito.Mockito;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ParkingLotTest {

    private ParkingLot parkingLot;

    @BeforeMethod
    public void setUp() {
        parkingLot = new ParkingLot(5);
    }

    @Test
    public void itShouldCheckIfHasSpace() {
        assertTrue(parkingLot.hasSpace());
    }

    @Test
    public void itShouldIfNotHasSpace() {
        var parkingLot = new ParkingLot(1);
        var car = new Car();
        parkingLot.park(car);
        assertFalse(parkingLot.hasSpace());
    }

    @Test
    public void itShouldParkACar() {
        var car = new Car();
        parkingLot.park(car);
        assertEquals(parkingLot.getCarsParked().size(), 1);

    }

    @Test
    public void itShouldCheckCapacityRateBelowLimit() {
        assertTrue(parkingLot.checkCapacityRate(80));
    }

    @Test
    public void itShouldCheckCapacityRateAboveLimit() {
        var parkingLot = new ParkingLot(1);
        var car = new Car();
        parkingLot.park(car);
        assertFalse(parkingLot.checkCapacityRate(80));
    }

    @Test
    public void itShouldNotifyAOwnerWhenParkingLotIsOver75Percentage() {
        var carOne = new Car();
        var carTwo = new Car();
        var carThree = new Car();
        var notification = new OverUsageNotification();
        parkingLot.park(carOne);
        parkingLot.park(carTwo);
        parkingLot.park(carThree);
        Mockito.verify(notification).sendNotification();
        assertTrue(parkingLot.checkCapacityRate(75));

    }

}