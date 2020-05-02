package strategyPattern.examples.duckExample.duckTypes;

import strategyPattern.examples.duckExample.run.Duck;
import strategyPattern.examples.duckExample.duckCapabilities.FlyNoWay;
import strategyPattern.examples.duckExample.duckCapabilities.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I am Decoy Duck!");
    }
}
