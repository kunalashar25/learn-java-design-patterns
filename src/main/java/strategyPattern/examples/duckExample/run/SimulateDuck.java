package strategyPattern.examples.duckExample.run;

import strategyPattern.examples.duckExample.duckCapabilities.FlyRocket;
import strategyPattern.examples.duckExample.duckCapabilities.Quack;
import strategyPattern.examples.duckExample.duckTypes.DecoyDuck;
import strategyPattern.examples.duckExample.duckTypes.RubberDuck;

public class SimulateDuck {

    public static void main(String[] args) {

        // Test decoy duck
        DecoyDuck decoy = new DecoyDuck();
        decoy.display();
        decoy.performFly();
        decoy.performQuack();
        decoy.swim();

        System.out.println("");

        // Test Rubber Duck
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();

        System.out.println("");

        // Test Rubber Duck with Runtime capabilities changes
        rubberDuck.display();
        rubberDuck.setFlyBehavior(new FlyRocket());
        rubberDuck.performFly();
        rubberDuck.setQuackBehavior(new Quack());
        rubberDuck.performQuack();
    }
}
