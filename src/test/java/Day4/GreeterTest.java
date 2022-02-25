package Day4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GreeterTest {

    public static final String EXPECTED_GREET = "Hello Estefanie";

    @Test
    public void itShouldGreetSomeone() {
        assertEquals(Greeter.greet("Estefanie"), EXPECTED_GREET);
    }

    @Test
    public void itShouldGreetSomeoneTrimmingTheName() {
        assertEquals(Greeter.greet("      Estefanie         "), EXPECTED_GREET);
    }

    @Test
    public void itShouldCapitalizeTheFirstLetterOfTheName() {
        assertEquals(Greeter.greet("estefanie"), EXPECTED_GREET);
    }

    @Test
    public void itShouldGreetWithGoodMorningFrom6To12() {
        assertEquals(Greeter.greet("Estefanie"), "Good morning Estefanie");
    }
}
