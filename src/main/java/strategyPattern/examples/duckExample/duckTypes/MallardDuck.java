package strategyPattern.examples.duckExample.duckTypes;

import strategyPattern.examples.duckExample.run.Duck;

public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am Mallard Duck!");
    }
}
