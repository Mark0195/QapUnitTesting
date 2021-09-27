package Qap;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void TestGetArea() {
        Rectangle rectangleUnderTest = new Rectangle(5,6);
        Assert.assertTrue(rectangleUnderTest.getArea() == (5 * 6));
    }
    @Test
    public void TestGetPerimeter() {
        Rectangle rectangleUnderTest = new Rectangle(7,8);
        Assert.assertTrue(rectangleUnderTest.getPerimeter() == (2 * 7 + 8));
    }

}
