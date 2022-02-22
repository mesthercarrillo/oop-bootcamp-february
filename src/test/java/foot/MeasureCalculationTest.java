package foot;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MeasureCalculationTest {

    @Test
    public void itShouldConvertOneFootToMeter() {
        assertEquals(MeasureCalculation.convertFeetToMeters(1), 0.3048 );
    }

    @Test
    public void itShouldConvertFiveFeetToMeter() {
        assertEquals(MeasureCalculation.convertFeetToMeters(5), 1.524 );
    }

    @Test
    public void itShouldCompareFeetWithMeter() {
        Assert.assertTrue(MeasureCalculation.areFeetEquivalentToMeters(5, 1.524));
    }



    @Test
    public void itShouldConvertOneInchToYards() {
        assertEquals(MeasureCalculation.convertInchesToYards(1), 0.0278 );
    }

    @Test
    public void itShouldConvertFiveInchToYards() {
        assertEquals(MeasureCalculation.convertInchesToYards(5), 0.1389, 4 );
    }

    @Test
    public void itShouldCompareInchesWithYards() {
        Assert.assertTrue(MeasureCalculation.areInchesEquivalentToYards(5, 0.13899999999999998));
    }


    @Test
    public void itShouldConvertTwoMetersToCentimeters() {
        assertEquals(MeasureCalculation.convertMetersToCentimeters(2), 200 );
    }

    @Test
    public void itShouldCompareMetersWithCentimeters() {
        Assert.assertTrue(MeasureCalculation.areMetersEquivalentToCentimeters(2, 200));
    }

    @Test
    public void itShouldConvertFourGallonsToLiters() {
        assertEquals(MeasureCalculation.convertGallonsToLiters(4), 15.1416 );
    }

    @Test
    public void itShouldCompareGallonsWithLiters() {
        Assert.assertTrue(MeasureCalculation.areGallonsEquivalentToLiters(4, 15.1416));
    }


}