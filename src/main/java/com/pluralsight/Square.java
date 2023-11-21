package com.pluralsight;

import java.awt.*;

public class Square extends Shape{
    public Square(Turtle turtle, double x, double y, Color color, double width) {
        super(turtle, x, y, color, width);
    }

    @Override
    public void paint() {
        super.paint();
    }
    public void square() {
        turtle.setColor(color);
        turtle.forward();
        turtle.turnRight(90);
    }
}
