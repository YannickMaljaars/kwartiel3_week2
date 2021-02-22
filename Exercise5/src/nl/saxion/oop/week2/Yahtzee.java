package nl.saxion.oop.week2;

import java.util.ArrayList;

public class Yahtzee {
    ArrayList<Dice> dice = new ArrayList<>();
    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();
    private Dice dice3 = new Dice();
    private Dice dice4 = new Dice();
    private Dice dice5 = new Dice();

    public Yahtzee() {
        dice.add(dice1);
        dice.add(dice2);
        dice.add(dice3);
        dice.add(dice4);
        dice.add(dice5);
    }

    public int[] roll(){
        int[] allDice = new int[5];
        allDice[0] = dice1.roll();
        allDice[1] = dice2.roll();
        allDice[2] = dice3.roll();
        allDice[3] = dice4.roll();
        allDice[4] = dice5.roll();
        return allDice;
    }

    public void draw() {
        for (int i = 0; i < 5; i++) {
            dice.get(i).draw(i*50+25, 100,25);
        }
    }

    public String determineCombination(int[] diceOutcomes) {

    }
}
