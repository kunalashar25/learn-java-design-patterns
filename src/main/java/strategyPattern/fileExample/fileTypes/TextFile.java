package strategyPattern.fileExample.fileTypes;

import strategyPattern.fileExample.creator.FileCreator;
import strategyPattern.fileExample.fileFormatters.LazyFormatter;

public class TextFile extends FileCreator {

    public TextFile() {
        setFileFormatter(new LazyFormatter());
    }

    @Override
    public void create() {
        System.out.println("Create Text File");
    }
}
