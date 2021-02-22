package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;
import nl.saxion.oop.week2.model.Airplane;
import nl.saxion.oop.week2.model.Passenger;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    Airplane plane = new Airplane(5);

    public void run() {
        int menuInput = -1;
        do {
            // We'll help you out by generating a random passenger to load.. Have a look at the method definition in the Passenger class!
            Passenger nextPassenger = Passenger.generateRandomPassenger();

            SaxionApp.clear();
            SaxionApp.printLine("****** Aircraft preparation terminal ******");
            SaxionApp.printLine("* 1) Load next passenger (" + nextPassenger + ")");
            SaxionApp.printLine("* 2) Lock/Unlock doors ");
            SaxionApp.printLine("* 9) Depart ");
            SaxionApp.printLine("* 0) Exit!");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");

            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {

                SaxionApp.printLine("The next passenger is: " + nextPassenger.toString());
                SaxionApp.print("They have ");
                SaxionApp.print(nextPassenger.getLuggage().size(), Color.ORANGE);
                SaxionApp.print(" bags with a total weight of ");
                SaxionApp.print(nextPassenger.getTotalLuggageWeight(), Color.ORANGE);
                SaxionApp.printLine(" kg.");

                SaxionApp.printLine();

                // TODO: Create your own implementation of how to get the passenger on board of your airplane!
                try{
                    plane.boardPassenger(nextPassenger);
                } catch (Exception e) {
                    SaxionApp.printLine(e.getMessage());
                }


                SaxionApp.pause();
            } else if (menuInput == 2) {

                // TODO: Implement the locking / unlocking of doors.
                if(plane.hasLockedDoors()){
                    plane.unlockDoors();
                    SaxionApp.printLine("The doors have been unlocked");
                }else {
                    try {
                        plane.lockDoors();
                        SaxionApp.printLine("The doors have been locked");
                    } catch (Exception e) {
                        SaxionApp.printLine(e.getMessage());
                    }

                }


                SaxionApp.pause();
            } else if (menuInput == 9) {

                // TODO: Implement departure. You can just print out a sentence if departure is successful.
                try {
                    plane.depart();
                    SaxionApp.printLine("Plane has departed!");
                } catch (IllegalStateException e) {
                    SaxionApp.printLine(e.getMessage());
                }

                SaxionApp.pause();

            }

        } while (menuInput != 0);

    }
}
