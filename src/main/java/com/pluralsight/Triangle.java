package com.pluralsight;

import java.awt.*;

public class Triangle extends Shape{
    public Triangle(Turtle turtle, double x, double y, Color color, double width) {
        super(turtle, x, y, color, width);
    }

    @Override
    public void paint() {
        super.paint();
    }

    public void triangle() {
        turtle.setColor(color);
        for (int i = 0; i < 3; i++) {
            turtle.forward();
            turtle.turnRight(120);
        }
    }
}
