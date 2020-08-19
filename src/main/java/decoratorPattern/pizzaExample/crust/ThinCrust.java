package decoratorPattern.pizzaExample.crust;

import decoratorPattern.pizzaExample.run.Pizza;

public class ThinCrust extends Pizza {

    public ThinCrust() {
        description = "Thin Crust Pizza";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
