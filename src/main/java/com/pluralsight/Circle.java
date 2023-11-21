package com.pluralsight;

import java.awt.*;

public class Circle extends Shape{
    public Circle(Turtle turtle, double x, double y, Color color, double width) {
        super(turtle, x, y, color, width);

    }

    @Override
    public void paint() {
        super.paint();
    }
    public void circle(int radius) {
        int sides = 360;
        int angle = 360 / sides;
        turtle.setColor(color);
        for (int i = 0; i < sides; i++) {
            turtle.forward();
            turtle.turnRight(angle);
        }
    }
}
