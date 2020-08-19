package decoratorPattern.starbuzzWithSizeExample.run;

public abstract class Beverage {
    public enum Size {
        TALL,
        GRAND,
        VENTI
    }

    ;

    Size size = Size.TALL;

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    protected String description = "Beverage Description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
