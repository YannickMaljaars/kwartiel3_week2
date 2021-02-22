package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new Application());
	}

	public void run() {
		// TODO: Write your own implementation. For a better idea on what to do, we have provided a sample implementation for the run() method.
		SaxionApp.setBackgroundColor(Color.gray);

		Yahtzee yahtzee = new Yahtzee();

		while (true) {
			SaxionApp.clear();

			int[] diceOutcomes = yahtzee.roll();
			for (int i:
				 diceOutcomes) {
				SaxionApp.printLine(i);
			}

			yahtzee.draw();


			String combination = yahtzee.determineCombination(diceOutcomes);
//			SaxionApp.drawText(combination, 10, 200, 40);


			SaxionApp.pause();
		}
	}
}
