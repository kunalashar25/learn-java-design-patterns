package decoratorPattern.starbuzzExample.run;

import decoratorPattern.starbuzzExample.beverageDecorator.Mocha;
import decoratorPattern.starbuzzExample.beverageDecorator.Whip;
import decoratorPattern.starbuzzExample.beverageTypes.Decaf;
import decoratorPattern.starbuzzExample.beverageTypes.Espresso;

public class SimulateBeverage {

    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " | $" + beverage1.cost());

        Beverage beverage2 = new Decaf();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " | $" + beverage2.cost());
    }
}
