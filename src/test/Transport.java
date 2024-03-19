package test;

public class Transport {
    String transportName;

    Transport(String transportName) {
        this.transportName = transportName;
    }
    public void run() {
        System.out.println("Покатили!");
    }

    public void transportName() {
        System.out.println(transportName);
    }

}
