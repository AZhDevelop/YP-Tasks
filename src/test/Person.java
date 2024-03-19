package test;

public class Person {
    public void startRide(Transport transport) {
        transport.transportName();
        transport.run();
        if (transport instanceof Bicycle) {
            ((Bicycle) transport).runFaster();
        } else if (transport instanceof RollerSkates) {
            ((RollerSkates) transport).jump();
        }
    }



}
