package strategyPattern.fileExample.fileFormatters;

public class NoFormatter implements FileFormatter {

    @Override
    public void format() {
        System.out.println("No Formatter Required");
    }
}
