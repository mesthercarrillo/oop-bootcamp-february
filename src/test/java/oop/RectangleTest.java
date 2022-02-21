package oop;

import math.Rectangle;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class RectangleTest {

    @Test
    public void itShouldInstanceARectangle() {

        Rectangle rectangle = new Rectangle();

        assertNotNull(rectangle);
    }
}