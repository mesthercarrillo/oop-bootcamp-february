package Day3;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CarTest {
    @Test
    public void itShouldParkACarInAParkingLot() {
        Car car = new Car();
        Assert.assertTrue(car.parkIn(new ParkingLot()));
    }


}