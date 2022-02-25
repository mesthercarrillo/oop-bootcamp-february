package Day5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringCalculatorTest {

    @Test
    public void itShouldReturnZeroForAnEmptyString() {
        assertEquals(StringCalculator.add(""), 0);
    }

    @Test
    public void itShouldReturnNumberValueForASingleNumber() {
        assertEquals(StringCalculator.add("1"), 1);
    }

    @Test
    public void itShouldReturnTheSumOfTwoNumberDelimitedByAComma() {
        assertEquals(StringCalculator.add("1,2"), 3);

    }

}