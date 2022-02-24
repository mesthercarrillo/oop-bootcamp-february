package Day3;

public class Car {

    private final String size;
    private final boolean handicapped;

    public Car(String size, boolean handicapped) {
        this.size = size;
        this.handicapped = handicapped;
    }

    public boolean isLarge() {
        return size.equals("Large");
    }

    public boolean isHandicapped() {
        return handicapped;
    }
}
