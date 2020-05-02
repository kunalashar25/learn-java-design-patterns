package strategyPattern.examples.duckExample.duckTypes;

import strategyPattern.examples.duckExample.duckCapabilities.FlyNoWay;
import strategyPattern.examples.duckExample.duckCapabilities.Squeak;
import strategyPattern.examples.duckExample.run.Duck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I am Rubber Duck!");
    }
}
