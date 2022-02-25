package Day5.nato;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FormatterTest {

    @Test
    public void itShouldEncodeAMessage() {
        assertEquals(Formatter.encode("hello"), "hotel-echo-lima-lima-oscar");


    }

}