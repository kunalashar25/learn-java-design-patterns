package strategyPattern.duckExample.duckTypes;

import strategyPattern.duckExample.run.Duck;

public class RedHeadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am RedHead Duck!");
    }
}
