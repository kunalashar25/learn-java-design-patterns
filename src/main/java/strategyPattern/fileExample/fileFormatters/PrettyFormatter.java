package strategyPattern.fileExample.fileFormatters;

public class PrettyFormatter implements FileFormatter {
    @Override
    public void format() {
        System.out.println("Pretty Formatting");
    }
}
