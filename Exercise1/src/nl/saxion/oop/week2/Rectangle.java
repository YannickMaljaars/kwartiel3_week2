package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Rectangle {

    // TODO: Implement different constructors.
    private int x = 0;
    private int y = 0;
    private int width = 100;
    private int height = 100;
    private Color color = Color.red;

    public Rectangle(){
    }
    public Rectangle(int x, int y) {
        this();
        this.x = x;
        this.y = y;
    }
    public Rectangle(int x, int y, int width, int height) {
        this(x, y);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Color color) {
        this();
        this.color = color;
    }

    public Rectangle(int x, int y, Color color) {
        this(x,y);
        this.color = color;
    }

    public Rectangle(int x, int y, int width, int height, Color color) {
        this(x,y,width,height);
        this.color = color;
    }






    public void draw() {
        // TODO: Implement this method!
        SaxionApp.setBorderColor(Color.black);
        SaxionApp.setFill(color);
        SaxionApp.drawRectangle(x, y, width, height);
    }
}
