package Day3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CarTest {
    @Test
    public void itShouldParkInAParkingLot() {
        Car car = new Car();
        assertEquals(car.parkIn("Parking"), "Car park in Parking");
    }

    @Test
    public void itShouldBeingRetrieveFromAParkingLot() {
        Car car = new Car();
        assertEquals(car.parkOut("Parking"), "Car is being retrieve from Parking");
    }

    @Test
    public void itShouldBeParkedByTheAssistant() {
        Car car = new Car();
        //assertEquals(car.parkInBy(person, location), "Car is being parked in parking by assistant");
    }
}