package strategyPattern.duckExample.duckTypes;

import strategyPattern.duckExample.duckCapabilities.FlyNoWay;
import strategyPattern.duckExample.duckCapabilities.MuteQuack;
import strategyPattern.duckExample.run.Duck;

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
