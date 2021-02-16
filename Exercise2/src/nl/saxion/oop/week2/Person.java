package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

public class Person {
    private String firstname;
    private String lastname;
    private String zipCode;
    private String phoneNumber;
    private int age;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age is negative.");
        } else if (age > 150) {
            throw new IllegalArgumentException("Age is too high.");
        }

        this.age = age;
    }

    public void setZipCode(String zipCode) {
        // TODO: Implement checks and make sure to throw an IllegalArgumentException if something goes wrong!
        if (zipCode.length() > 6) {
            throw new IllegalArgumentException("Zipcode longer than 6 characters ( 6 required)");
        } else if (zipCode.length() < 6) {
            throw new IllegalArgumentException("Zipcode shorter than 6 characters ( 6 required)");
        }


        for (int i = 0; i < zipCode.length(); i++) {
            if (i < 4) {
                if (!Character.isDigit(zipCode.charAt(i))) {
                    throw new IllegalArgumentException("First 4 characters contain non numeric");
                }
            } else {
                if (Character.isDigit(zipCode.charAt(i))) {
                    throw new IllegalArgumentException("Last 2 characters contain numeric");
                }
            }
        }

        this.zipCode = zipCode;
    }

    public void setPhonenumber(String phoneNumber) {
        // TODO: Implement checks and make sure to throw an IllegalArgumentException if something goes wrong!
        if (!phoneNumber.startsWith(""+0)){
            throw new IllegalArgumentException("Phone numbers must start with a 0");
        } else if (phoneNumber.length() != 10){
            throw new IllegalArgumentException("Phone numbers must have 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }

    /**
     * This is the default generated toString from IntelliJ. It works for now!
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}