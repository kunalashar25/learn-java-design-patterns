package decoratorPattern.pizzaExample.run;

import decoratorPattern.pizzaExample.crust.ThinCrust;
import decoratorPattern.pizzaExample.toppings.Cheese;
import decoratorPattern.pizzaExample.toppings.Olives;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new ThinCrust();
        pizza = new Cheese(pizza);
        pizza = new Olives(pizza);

        System.out.println(pizza.getDescription() + " $" + pizza.cost());
    }
}
