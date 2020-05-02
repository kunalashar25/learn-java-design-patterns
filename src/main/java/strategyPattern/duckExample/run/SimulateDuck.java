package strategyPattern.duckExample.run;

import strategyPattern.duckExample.duckCapabilities.FlyRocket;
import strategyPattern.duckExample.duckCapabilities.Quack;
import strategyPattern.duckExample.duckTypes.DecoyDuck;
import strategyPattern.duckExample.duckTypes.RubberDuck;

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
