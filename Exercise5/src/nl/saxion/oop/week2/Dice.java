package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

public class Dice {
    private int rolledNumber;

    public int roll() {
        rolledNumber = SaxionApp.getRandomValueBetween(1,7);
        return rolledNumber;
    }

    public int getRolledNumber() {
        return rolledNumber;
    }

    public void draw(int x, int y, int width) {
        for (int i = 1; i < 7; i++) {
            if(i == rolledNumber) {
                SaxionApp.drawImage("Exercise5/images/" + i + ".png", x, y, width, width);
            }
        }
    }
}
