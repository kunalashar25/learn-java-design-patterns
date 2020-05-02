package strategyPattern.examples.duckExample.duckCapabilities;

public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I can't Fly!");
    }
}
