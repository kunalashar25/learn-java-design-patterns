package decoratorPattern.starbuzzWithSizeExample.run;

import decoratorPattern.starbuzzWithSizeExample.beverageDecorator.Mocha;
import decoratorPattern.starbuzzWithSizeExample.beverageDecorator.Soy;
import decoratorPattern.starbuzzWithSizeExample.beverageDecorator.Whip;
import decoratorPattern.starbuzzWithSizeExample.beverageTypes.Decaf;
import decoratorPattern.starbuzzWithSizeExample.beverageTypes.Espresso;

public class SimulateBeverage {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.Size.VENTI);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription() + " | $" + beverage.cost());
    }
}
