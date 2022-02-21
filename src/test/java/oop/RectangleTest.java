package oop;

import math.Rectangle;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class RectangleTest {

    @Test
    public void itShouldInstanceARectangle() {
        Rectangle rectangle = new Rectangle(0,0);
        assertNotNull(rectangle);
    }

    @Test
    public void itShouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(2.5, 2.5);
        assertEquals(rectangle.calculatePerimeter(), 10);
    }

    @Test
    public void itShouldCalculateArea() {
        Rectangle rectangle = new Rectangle(2.5, 2.5);
        assertEquals(rectangle.calculateArea(), 6.25);
    }
}