package Day3;

import org.mockito.Mock;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class UsageServiceTest {

    private UsageService usageService = new UsageService();

    @Mock
    private ParkingLot parkingLot;

    @BeforeMethod
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void itShouldCheckCapacityRateBelowLimit() {
        when(parkingLot.getCapacity()).thenReturn(2);
        when(parkingLot.getCarsParked()).thenReturn(Collections.emptySet());

        assertTrue(usageService.checkCapacityRateLessThan(parkingLot, 80));
    }

    @Test
    public void itShouldCheckCapacityRateAboveLimit() {
        when(parkingLot.getCapacity()).thenReturn(2);
        when(parkingLot.getCarsParked()).thenReturn(Set.of(
            mock(Car.class),
            mock(Car.class)
        ));

        assertFalse(usageService.checkCapacityRateLessThan(parkingLot, 80));
    }

/*    @Test
    public void itShouldNotifyAOwnerWhenParkingLotIsOver75Percentage() {
        var carOne = new Car();
        var carTwo = new Car();
        var carThree = new Car();
        var carFour = new Car();
        parkingLot.park(carOne);
        parkingLot.park(carTwo);
        parkingLot.park(carThree);
        parkingLot.park(carFour);
        verify(usageNotification, times(2)).sendNotification(anyInt());
        assertFalse(parkingLot.checkCapacityRateLessThan(75));

    }

    @Test
    public void itShouldNotifyWhenParkingLotUsageIsLessTha20Percent() {
        var carOne = new Car();
        parkingLot.park(carOne);
        verify(usageNotification).sendNotification(anyInt());

    }*/
}