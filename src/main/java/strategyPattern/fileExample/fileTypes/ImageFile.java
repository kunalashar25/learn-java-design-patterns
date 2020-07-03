package strategyPattern.fileExample.fileTypes;

import strategyPattern.fileExample.creator.FileCreator;
import strategyPattern.fileExample.fileFormatters.NoFormatter;

public class ImageFile extends FileCreator {

    public ImageFile() {
        setFileFormatter(new NoFormatter());
    }

    @Override
    public void create() {
        System.out.println("Create Image File");
    }
}
