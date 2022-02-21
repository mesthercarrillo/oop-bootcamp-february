package math;

public class Rectangle {

    private double height;
    private double width;

    public Rectangle(double x, double y){
        this.height = x;
        this.width = y;
    }

    public double calculatePerimeter() {
        return 2 * (height + width);
    }
}
