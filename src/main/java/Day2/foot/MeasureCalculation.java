package Day2.foot;

public class MeasureCalculation {


    public static boolean areEquivalent(Measure measure1, Measure measure2) {
        Meter meter1 = new Meter(measure1.convertToMeters());
        Meter meter2 = new Meter(measure2.convertToMeters());
        return Double.compare(meter1.getValue() , meter2.getValue()) == 0;
    }
}
