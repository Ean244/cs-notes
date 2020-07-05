package io.github.ean244;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HashTest {
    private Point point;

    @Before
    public void init() {
        point = new Point(1, 2, "Point");
    }

    @Test
    public void testEqualHash() {
        Point x = new Point(1, 2, "Point");

        assertEquals(point, x);
        assertEquals(point.hashCode(), x.hashCode());
    }
}
