package decoratorPattern.starbuzzWithSizeExample.beverageTypes;

import decoratorPattern.starbuzzWithSizeExample.run.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
