package foot;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MeasureCalculationTest {

    @Test
    public void itShouldConvertOneFootToMeter() {
        MeasureCalculation measureCalculation = new MeasureCalculation();
        assertEquals(measureCalculation.convertFeetToMeters(1), 0.3048 );
    }
    @Test
    public void itShouldConvertFiveFeetToMeter() {
        MeasureCalculation measureCalculation = new MeasureCalculation();
        assertEquals(measureCalculation.convertFeetToMeters(5), 1.524 );
    }

}