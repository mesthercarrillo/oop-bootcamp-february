package foot;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MeasureCalculationTest {

    @Test
    public void itShouldCompareFeetWithMeter() {
        Foot feet = new Foot(5);
        Meter meters = new Meter(1.5240000000000002);
        Assert.assertTrue(MeasureCalculation.areEquivalent(feet, meters));
    }

//    @Test
//    public void itShouldCompareInchesWithYards() {
//        Inches inches = new Inches(5);
//        Yards yards = new Yards(0.13899999999999998);
//        Assert.assertTrue(MeasureCalculation.areEquivalent(inches, yards));
//    }

    @Test
    public void itShouldCompareMetersWithCentimeters() {
        Meter meter = new Meter(2);
        Centimeter centimeter = new Centimeter(200);
        Assert.assertTrue(MeasureCalculation.areEquivalent(meter, centimeter));
    }

//
//    @Test
//    public void itShouldCompareGallonsWithLiters() {
//        Assert.assertTrue(MeasureCalculation.areGallonsEquivalentToLiters(4, 15.1416));
//    }


}