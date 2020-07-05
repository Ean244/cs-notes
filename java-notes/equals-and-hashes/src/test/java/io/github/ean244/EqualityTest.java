package io.github.ean244;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EqualityTest {
    private Point point;

    @Before
    public void init() {
        point = new Point(1, 2, "Point");
    }

    @Test
    public void testReflexivity() {
        assertEquals(point, point);
    }

    @Test
    public void testTransitivity() {
        Point y = new Point(1, 2, "Point");
        Point z = new Point(point.getX(), point.getY(), point.getName());

        assertEquals(point, y);
        assertEquals(y, z);
        assertEquals(point, z);
    }

    @Test
    public void testNonNullity() {
        assertFalse(point.equals(null));
    }
}
