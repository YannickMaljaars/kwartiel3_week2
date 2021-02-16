package nl.saxion.oop.week2;

import jdk.jshell.execution.LoaderDelegate;

import java.time.LocalDate;

public class Author {
    private String name;
    private LocalDate birthday;


    public Author(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + "}";
    }
}
