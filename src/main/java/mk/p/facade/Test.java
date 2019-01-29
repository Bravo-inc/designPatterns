package mk.p.facade;

public class Test {
    public static void main(String[] args) {
        GPSPower power = new GPSPower();
        GPSNotifier notifier = new GPSNotifier();
        RoadAdvisor advisor = new RoadAdvisor();

        GPSInterface gps = new GPSInterface(power, notifier, advisor);

        //The driver turns on the navigation system
        gps.activate();
        //The driver turns off the navigation system
        power.powerOff();
    }
}