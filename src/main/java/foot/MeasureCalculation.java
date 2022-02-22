package foot;

public class MeasureCalculation {

    public static final double FEET_METERS_CONVERSION_FACTOR = 0.3048;
    public static final double INCHES_YARDS_CONVERSION_FACTOR = 0.0278;
    public static final double METERS_CENTIMETER_CONVERSION_FACTOR = 100;
    public static final double GALLONS_LITERS_CONVERSION_FACTOR = 3.7854;


    public static double convertFeetToMeters(double numberOfFeet) {
        return (numberOfFeet * FEET_METERS_CONVERSION_FACTOR);
    }

    public static boolean areFeetEquivalentToMeters(double feet, double meters) {
        return meters == convertFeetToMeters(feet);
    }


    public static double convertInchesToYards(double inches) {
        return inches * INCHES_YARDS_CONVERSION_FACTOR;
    }

    public static boolean areInchesEquivalentToYards(double inches, double yards) {
        return yards == convertInchesToYards(inches);
    }

    public static double convertMetersToCentimeters(double meters) {
        return meters * METERS_CENTIMETER_CONVERSION_FACTOR;
    }

    public static boolean areMetersEquivalentToCentimeters(double meters, double centimeters) {
        return centimeters == convertMetersToCentimeters(meters);
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_LITERS_CONVERSION_FACTOR;
    }

    public static boolean areGallonsEquivalentToLiters(double gallons, double liters) {
        return liters == convertGallonsToLiters(gallons);
    }
}
