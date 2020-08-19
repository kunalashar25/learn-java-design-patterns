package decoratorPattern.starbuzzWithSizeExample.beverageDecorator;

import decoratorPattern.starbuzzWithSizeExample.run.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
