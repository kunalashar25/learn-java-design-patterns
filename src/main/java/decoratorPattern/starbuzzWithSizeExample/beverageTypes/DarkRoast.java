package decoratorPattern.starbuzzWithSizeExample.beverageTypes;

import decoratorPattern.starbuzzWithSizeExample.run.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
