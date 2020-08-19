package decoratorPattern.pizzaExample.toppings;

import decoratorPattern.pizzaExample.run.Pizza;

public abstract class ToppingsDecorator extends Pizza {
    Pizza pizza;
    public abstract String getDescription();
}
