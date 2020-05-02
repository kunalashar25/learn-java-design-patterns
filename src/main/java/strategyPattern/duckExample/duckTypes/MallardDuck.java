package strategyPattern.duckExample.duckTypes;

import strategyPattern.duckExample.run.Duck;

public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am Mallard Duck!");
    }
}
