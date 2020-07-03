package strategyPattern.fileExample.fileTypes;

import strategyPattern.fileExample.creator.FileCreator;
import strategyPattern.fileExample.fileFormatters.PrettyFormatter;

public class JsonFile extends FileCreator {

    public JsonFile() {
        setFileFormatter(new PrettyFormatter());
    }

    @Override
    public void create() {
        System.out.println("Create JSON File");
    }
}
