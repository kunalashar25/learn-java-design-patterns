package strategyPattern.examples.duckExample.duckCapabilities;

public class Quack implements QuackBehavior {

    public void quack() {
        System.out.println("I am Quacking!");
    }
}
