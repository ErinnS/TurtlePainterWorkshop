package com.pluralsight;

public abstract class Shape {
    private String turtle;
    private double x;
    private double y;
    private String color;
    private double width;

    public Shape(String turtle, double x, double y, String color, double width) {
        this.turtle = turtle;
        this.x = x;
        this.y = y;
        this.color = color;
        this.width = width;
    }
    public void paint() {

    }

}
