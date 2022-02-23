package math;

public class Rectangle {

    private static final int MULTIPLE_FACTOR = 2;
    private final double height;
    private final double width;

    public Rectangle(final double x, final double y){
        this.height = x;
        this.width = y;
    }

    public double calculatePerimeter() {
        return MULTIPLE_FACTOR * (height + width);
    }

    public double calculateArea() {
        return height * width;
    }
}
