package oop;

import math.Rectangle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTest {

    public static final double height = 2.5;
    public static final double width = 2.5;
    private Rectangle rectangle;

    @BeforeMethod
    public void setUp() {
        this.rectangle = new Rectangle(height, width);
    }

    @Test
    public void itShouldCalculatePerimeter() {
        assertEquals(rectangle.calculatePerimeter(), 10);
    }

    @Test
    public void itShouldCalculateArea() {
        assertEquals(rectangle.calculateArea(), 6.25);
    }
}