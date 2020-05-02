package strategyPattern.duckExample.duckTypes;

import strategyPattern.duckExample.duckCapabilities.FlyNoWay;
import strategyPattern.duckExample.duckCapabilities.Squeak;
import strategyPattern.duckExample.run.Duck;

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
