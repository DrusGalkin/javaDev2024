package ru.galkin.reflection.ex8_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectsReader {
    private ObjectsManager manager;
    private FileReader file;

    protected ObjectsReader(ObjectsManager manager, File file){
        try {
            this.file = new FileReader(file);
            this.manager = manager;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    protected List<Class> read() throws IOException {
        List<Class> classList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(file)){
            String className;
            while ((className = reader.readLine()) != null){
                try{
                    classList.add(Class.forName(className));
                } catch (Exception e){
                }
            }
            System.out.println(classList);
            return classList;
        } catch (Exception e){
            throw new RuntimeException();
        }
    }
}
