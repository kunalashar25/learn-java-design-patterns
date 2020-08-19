package decoratorPattern.starbuzzExample.run;

public abstract class Beverage {

    protected  String description = "Beverage Description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
