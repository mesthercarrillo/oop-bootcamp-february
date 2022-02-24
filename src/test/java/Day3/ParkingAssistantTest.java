package Day3;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class ParkingAssistantTest {

    private ParkingAssistant parkingAssistant;
    private static String SMALL_CAR_SIZE = "Small";
    private static String LARGE_CAR_SIZE = "Large";

    @Mock
    private UsageService usageService;

    @BeforeMethod
    public void setUp() {
        initMocks(this);
        parkingAssistant = new ParkingAssistant(new HashSet<>(), usageService);

    }

    @Test
    public void itShouldParkACarInTheFirstParkingLotAvailable() {
        var parkingLot = mock(ParkingLot.class);
        when(parkingLot.hasSpace()).thenReturn(true);
        when(usageService.checkCapacityRateLessThan(parkingLot, 80)).thenReturn(true);

        parkingAssistant.addParkingLot(parkingLot);
        var car = new Car(SMALL_CAR_SIZE, false);


        var selectedParking = parkingAssistant.parkInFirstParkingLotAvailable(car);
        assertEquals(selectedParking, parkingLot);
        Mockito.verify(parkingLot).park(car);
        Mockito.verify(usageService).checkCapacityRateLessThan(parkingLot, 80);
    }

    @Test
    public void itShouldParkALargeCarInTheParkingLotWithMoreCapacity() {
        var parkingLot30Percent = mock(ParkingLot.class);
        var parkingLot40Percent = mock(ParkingLot.class);
        when(usageService.checkCapacityRateLessThan(parkingLot30Percent, 80d)).thenReturn(true);
        when(usageService.checkCapacityRateLessThan(parkingLot40Percent, 80d)).thenReturn(true);

        parkingAssistant.addParkingLot(parkingLot40Percent);
        parkingAssistant.addParkingLot(parkingLot30Percent);

        Car car = new Car(LARGE_CAR_SIZE, false);
        var selectedParking = parkingAssistant.parkInFirstParkingLotAvailable(car);

        assertEquals(selectedParking, parkingLot30Percent);
        verify(parkingLot30Percent).park(car);
    }

    @Test
    public void itShouldParkAHandicapCarInAParkingLotThatAcceptsHandicaps() {
        var handicapFriendlyParkingLot = mock(ParkingLot.class);
        when(handicapFriendlyParkingLot.isHandicapFriendly()).thenReturn(true);
        when(usageService.checkCapacityRateLessThan(handicapFriendlyParkingLot, 80d)).thenReturn(true);

        parkingAssistant.addParkingLot(handicapFriendlyParkingLot);

        Car car = new Car(SMALL_CAR_SIZE, true);
        var selectedParking = parkingAssistant.parkInFirstParkingLotAvailable(car);

        assertEquals(selectedParking, handicapFriendlyParkingLot);
        verify(handicapFriendlyParkingLot).park(car);
    }

    @Test
    public void itShouldNotParkAHandicapCarIfThereAreNoParkingLotsThatAcceptsHandicaps() {
        var handicapUnfriendlyParkingLot = mock(ParkingLot.class);
        when(handicapUnfriendlyParkingLot.isHandicapFriendly()).thenReturn(false);
        when(usageService.checkCapacityRateLessThan(handicapUnfriendlyParkingLot, 80d)).thenReturn(true);

        parkingAssistant.addParkingLot(handicapUnfriendlyParkingLot);

        Car car = new Car(SMALL_CAR_SIZE, true);
        var selectedParking = parkingAssistant.parkInFirstParkingLotAvailable(car);

        assertNull(selectedParking);
        verify(handicapUnfriendlyParkingLot, never()).park(car);
    }
}
