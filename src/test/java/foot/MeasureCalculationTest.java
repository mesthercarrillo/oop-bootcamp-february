package foot;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MeasureCalculationTest {

    @Test
    public void itShouldCompareFeetWithMeter() {
        Foot feet = new Foot(5);
        Meter meters = new Meter(1.524);
        Assert.assertTrue(MeasureCalculation.areEquivalent(feet, meters));
    }


    @Test
    public void itShouldCompareInchesWithYards() {

        Assert.assertTrue(MeasureCalculation.areInchesEquivalentToYards(5, 0.13899999999999998));
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