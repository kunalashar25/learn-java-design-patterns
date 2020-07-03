package strategyPattern.fileExample.creator;

import strategyPattern.fileExample.fileFormatters.FileFormatter;

public abstract class FileCreator {
    FileFormatter fileFormatter;

    public void setFileFormatter(FileFormatter fileFormatter) {
        this.fileFormatter = fileFormatter;
        doFormatting();
    }

    private void doFormatting() {
        fileFormatter.format();
    }

    public abstract void create();

    public void checkFileCreated(String fileName) {
        System.out.println(fileName + " file Created!");
    }
}
