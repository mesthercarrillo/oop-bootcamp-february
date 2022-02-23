package Day3;

import org.mockito.Mockito;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ParkingLotTest {

    private ParkingLot parkingLot;

    private OverUsageNotification notification;

    @BeforeMethod
    public void setUp() {
        notification = mock(OverUsageNotification.class);
        parkingLot = new ParkingLot(5, notification);
    }

    @Test
    public void itShouldCheckIfHasSpace() {
        assertTrue(parkingLot.hasSpace());
    }

    @Test
    public void itShouldIfNotHasSpace() {
        var parkingLot = new ParkingLot(1, notification);
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
        assertTrue(parkingLot.checkCapacityRateLessThan(80));
    }

    @Test
    public void itShouldCheckCapacityRateAboveLimit() {
        var parkingLot = new ParkingLot(1, notification);
        var car = new Car();
        parkingLot.park(car);
        assertFalse(parkingLot.checkCapacityRateLessThan(80));
    }

    @Test
    public void itShouldNotifyAOwnerWhenParkingLotIsOver75Percentage() {
        var carOne = new Car();
        var carTwo = new Car();
        var carThree = new Car();
        var carFour = new Car();
        parkingLot.park(carOne);
        parkingLot.park(carTwo);
        parkingLot.park(carThree);
        parkingLot.park(carFour);
        Mockito.verify(notification).sendNotification();
        assertFalse(parkingLot.checkCapacityRateLessThan(75));

    }

}