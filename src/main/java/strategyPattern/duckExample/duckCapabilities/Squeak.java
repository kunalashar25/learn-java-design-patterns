package strategyPattern.duckExample.duckCapabilities;

public class Squeak implements QuackBehavior {

    public void quack() {
        System.out.println("I can Squeak!");
    }
}
