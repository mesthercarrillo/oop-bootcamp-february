package Day3;

public class Car {

    private final String size;
    private final boolean adaptable;

    public Car(String size, boolean adaptable) {
        this.size = size;
        this.adaptable = adaptable;
    }

    public boolean isLarge() {
        return size.equals("Large");
    }

    public boolean isAdaptable() {
        return adaptable;
    }
}
