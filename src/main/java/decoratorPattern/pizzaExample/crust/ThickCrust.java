package decoratorPattern.pizzaExample.crust;

import decoratorPattern.pizzaExample.run.Pizza;

public class ThickCrust extends Pizza {

    public ThickCrust() {
        description = "Thick Crust Pizza";
    }


    @Override
    public double cost() {
        return 8.99;
    }
}
