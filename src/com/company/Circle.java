package com.company;

public class Circle {
    private int radius;
    private double y;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getY() {
        final double PI = 3.14;
        y = PI * getRadius() * getRadius();
        return y;
    }
}
