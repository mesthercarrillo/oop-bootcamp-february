package Day4;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GreeterTest {

    public static final String EXPECTED_GREET = "Hello Estefanie";
    public Greeter greeter;

    @BeforeMethod
    public void setUp() {
        greeter = new Greeter("17:12");
    }

    @Test
    public void itShouldGreetSomeone() {
        assertEquals(greeter.greet("Estefanie"), EXPECTED_GREET);
    }

    @Test
    public void itShouldGreetSomeoneTrimmingTheName() {
        assertEquals(greeter.greet("      Estefanie         "), EXPECTED_GREET);
    }

    @Test
    public void itShouldCapitalizeTheFirstLetterOfTheName() {
        assertEquals(greeter.greet("estefanie"), EXPECTED_GREET);
    }

    @Test
    public void itShouldGreetWithGoodMorningFrom6To12() {
        Greeter morningGreeter = new Greeter("6:13");
        assertEquals(morningGreeter.greet("Estefanie"), "Good morning Estefanie");
    }
}
