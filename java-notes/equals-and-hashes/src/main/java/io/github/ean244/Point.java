package io.github.ean244;

import java.util.Objects;

public class Point {
    private final double x;
    private final double y;
    private final String name;

    public Point(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0 &&
                name.equals(point.name);
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(x);
        result += 31 * result + Double.hashCode(y);
        result += 31 * result + name.hashCode();
        return result;
    }
}
