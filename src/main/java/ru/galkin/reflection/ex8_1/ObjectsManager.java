package ru.galkin.reflection.ex8_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ObjectsManager {
    private ObjectsReader reader;
    private ObjectsWriter writer;
    private File file;
    private String location;

    public ObjectsManager(String location) throws FileNotFoundException {
        try {
            this.location = location;
            this.file = new File(this.location);
            this.reader = new ObjectsReader(this, file);
            this.writer = new ObjectsWriter(this, file);
        } catch (Exception e){
            throw new FileNotFoundException("Файл не был открыт по данному адресу: " + location);
        }
    }

    public void write(Object...objects) throws IOException, NoSuchMethodException {
        writer.write(objects);
    }

    public void read() throws IOException {
        reader.read();
    }
}
