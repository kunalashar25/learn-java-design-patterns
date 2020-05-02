package strategyPattern.examples.duckExample.duckTypes;

import strategyPattern.examples.duckExample.run.Duck;

public class RedHeadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am RedHead Duck!");
    }
}
