package strategyPattern.duckExample.duckCapabilities;

public class FlyRocket implements FlyBehavior {

    public void fly() {
        System.out.println("I am Flying with Rocket Speed!");
    }
}
