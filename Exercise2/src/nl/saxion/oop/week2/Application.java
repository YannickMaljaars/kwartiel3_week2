package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    Person p;

    public void run() {
        // First test if everything works well with valid data:
        Person goodPerson = new Person("Evert", "Duipmans");
        goodPerson.setAge(33);
        goodPerson.setZipCode("8888AA");
        goodPerson.setPhonenumber("0612345678");
        SaxionApp.printLine(goodPerson);

        // Now test with invalid data:

        // Test 1: check invalid age
        try {
            p = new Person("Tristan", "Pothoven");
            p.setAge(-1);
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // Test 2: check invalid zipcode (too short)
        try {
             p = new Person("Yannick", "Maljaars");
             p.setZipCode("7555D");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // Test 3: check invalid zipcode (not numeric)

        try {
            p = new Person("Yannick", "Maljaars");
            p.setZipCode("755DDD");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }


        // Test 4: check invalid zipcode (no letters)

        try {
            p = new Person("Yannick", "Maljaars");
            p.setZipCode("755555");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }


        // Test 5: check phone number (too long)
        try {
            p = new Person("Yannick", "Maljaars");
            p.setPhonenumber("06123456789");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // TODO: Implement this check.

        // Test 6: check phone number (not starting with a 0)

        try {
            p = new Person("Yannick", "Maljaars");
            p.setPhonenumber("1614023223");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }
        // TODO: Implement this check.

    }
}