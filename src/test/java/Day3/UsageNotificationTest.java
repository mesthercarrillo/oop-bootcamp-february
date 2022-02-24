package Day3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UsageNotificationTest {

    @Test
    public void itShouldNotifyWhenCapacityReachs75Percent() {
        UsageNotification usageNotification = new UsageNotification();
        assertEquals(usageNotification.sendNotification(75), "Parking Usage is at 75%");

    }

}