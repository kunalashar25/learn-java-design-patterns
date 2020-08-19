package decoratorPattern.pizzaExample.toppings;

import decoratorPattern.pizzaExample.run.Pizza;

public class Olives extends ToppingsDecorator {
    Pizza pizza;

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.40;
    }
}
