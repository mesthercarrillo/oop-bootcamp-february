package foot;

public class MeasureCalculation {

    public static final double CONVERSION_FACTOR = 0.3048;

    public double convertFeetToMeters(double numberOfFeet) {
        return (numberOfFeet * CONVERSION_FACTOR);
    }
}
