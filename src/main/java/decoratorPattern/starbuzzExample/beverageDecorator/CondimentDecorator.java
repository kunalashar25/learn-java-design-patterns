package decoratorPattern.starbuzzExample.beverageDecorator;

import decoratorPattern.starbuzzExample.run.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
