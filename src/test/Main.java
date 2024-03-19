package test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Transport bicycle = new Bicycle();
        Transport rollerSkates = new RollerSkates();
        Person person = new Person();

        person.startRide(bicycle);
        person.startRide(rollerSkates);
    }

}
