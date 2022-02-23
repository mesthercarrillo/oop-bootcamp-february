package Day3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CarTest {
    @Test
    public void itShouldParkACarInAParkingLot() {
        Car car = new Car();
        assertEquals(car.parkIn("Parking"), "Car park in Parking");
        assertEquals(car.getParkedIn(), "Parking");

    }

    @Test
    public void itShouldRetrieveCarFromParkingLot() {
        Car car = new Car();
        car.parkOut();
        assertEquals(car.getParkedIn(), "");
    }
}