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
        double PI = 3.14;
        y = PI * radius * radius;
        return y;
    }
}
