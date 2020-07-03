package strategyPattern.fileExample.fileFormatters;

public class LazyFormatter implements FileFormatter {

    @Override
    public void format() {
        System.out.println("Lazy Formatting");
    }
}
