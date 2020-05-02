package strategyPattern.examples.duckExample.duckCapabilities;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("I am Mute!");
    }
}
