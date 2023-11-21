package com.pluralsight;

import java.awt.*;


public abstract class Shape {
    protected Turtle turtle;
    private double x;
    private double y;
    protected Color color;
    private double width;

    public Shape(Turtle turtle, double x, double y, Color color, double width) {
        this.turtle = turtle;
        this.x = x;
        this.y = y;
        this.color = color;
        this.width = width;
    }
    public void paint() {

    }

}
