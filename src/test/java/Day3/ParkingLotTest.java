package Day3;

import org.mockito.Mockito;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ParkingLotTest {

    private ParkingLot parkingLot;

    private UsageNotification usageNotification;

    @BeforeMethod
    public void setUp() {
        usageNotification = mock(UsageNotification.class);
        parkingLot = new ParkingLot(5, usageNotification);
    }

    @Test
    public void itShouldCheckIfHasSpace() {
        assertTrue(parkingLot.hasSpace());
    }

    @Test
    public void itShouldIfNotHasSpace() {
        var parkingLot = new ParkingLot(1, usageNotification);
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
        var parkingLot = new ParkingLot(1, usageNotification);
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
        verify(usageNotification).sendOveruseNotification();
        assertFalse(parkingLot.checkCapacityRateLessThan(75));

    }

    @Test
    public void itShouldNotifyWhenParkingLotUsageIsLessTha20Percent() {
        var carOne = new Car();
        parkingLot.park(carOne);
        verify(usageNotification).sendUnderuseNotification();

    }

}