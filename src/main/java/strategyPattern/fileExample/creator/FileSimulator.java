package strategyPattern.fileExample.creator;

import strategyPattern.fileExample.fileTypes.ImageFile;
import strategyPattern.fileExample.fileTypes.JsonFile;
import strategyPattern.fileExample.fileTypes.TextFile;

public class FileSimulator {

    public static void main(String[] args) {

        // simulating image file
        ImageFile imageFile = new ImageFile();
        imageFile.create();
        imageFile.checkFileCreated("Image");

        System.out.println("");

        TextFile textFile = new TextFile();
        textFile.create();
        textFile.checkFileCreated("Text");

        System.out.println("");

        JsonFile jsonFile = new JsonFile();
        jsonFile.create();
        jsonFile.checkFileCreated("JSON");
    }
}
