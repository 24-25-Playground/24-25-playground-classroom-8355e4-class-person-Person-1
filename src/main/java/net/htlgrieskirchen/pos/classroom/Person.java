package net.htlgrieskirchen.pos.classroom;

public class Person {
    private final String name;
    private final String firstname;

    public Person(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        // add code to return firstname, a blank and then name
        return firstname + " " + name;
    }
}