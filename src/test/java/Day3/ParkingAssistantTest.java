package Day3;

import org.mockito.Mockito;
import org.testng.annotations.Test;

import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

public class ParkingAssistantTest {

    @Test
    public void itShouldParkACarInTheFirstParkingLotAvailable() {
        var parkingLot = mock(ParkingLot.class);
        when(parkingLot.hasSpace()).thenReturn(true);
        when(parkingLot.checkCapacityRateLessThan(80)).thenReturn(true);

        var assistant = new ParkingAssistant(Set.of(parkingLot));
        var car = new Car();


        var selectedParking = assistant.parkInFirstParkingLotAvailable(car);
        assertEquals(selectedParking, parkingLot);
        Mockito.verify(parkingLot).park(car);
        Mockito.verify(parkingLot).checkCapacityRateLessThan(80);
    }
}
