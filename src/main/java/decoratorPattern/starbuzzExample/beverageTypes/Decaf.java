package decoratorPattern.starbuzzExample.beverageTypes;

import decoratorPattern.starbuzzExample.run.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
