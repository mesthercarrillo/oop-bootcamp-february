package Day3;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashSet;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.Assert.assertEquals;

public class ParkingAssistantTest {

    private ParkingAssistant parkingAssistant;

    @Mock
    private UsageService  usageService;

    @BeforeMethod
    public void setUp() {
        initMocks(this);
        parkingAssistant = new ParkingAssistant(new HashSet<>(), usageService);

    }

    @Test
    public void itShouldParkACarInTheFirstParkingLotAvailable() {
        var parkingLot = mock(ParkingLot.class);
        when(parkingLot.hasSpace()).thenReturn(true);
        when(usageService.checkCapacityRateLessThan(parkingLot,80)).thenReturn(true);

        parkingAssistant.addParkingLot(parkingLot);
        var car = new Car();


        var selectedParking = parkingAssistant.parkInFirstParkingLotAvailable(car);
        assertEquals(selectedParking, parkingLot);
        Mockito.verify(parkingLot).park(car);
        Mockito.verify(usageService).checkCapacityRateLessThan(parkingLot,80);
    }
}
