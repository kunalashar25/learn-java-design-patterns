package decoratorPattern.pizzaExample.toppings;

import decoratorPattern.pizzaExample.run.Pizza;

public class Cheese extends ToppingsDecorator {
    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra Cheese";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.50;
    }
}
