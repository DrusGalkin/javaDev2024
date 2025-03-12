package ru.galkin.reflection.ex8_1;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

public class ObjectsWriter {
    private ObjectsManager manager;
    private FileWriter writer;

    protected ObjectsWriter(ObjectsManager manager, File file) {
        try {
            this.writer = new FileWriter(file);
            this.manager = manager;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void write(Object... obj) throws IOException, NoSuchMethodException {
        List<String> list =
                Arrays.stream(obj)
                        .map(o ->
                                o.getClass().getName() + "\n"
                                + Arrays.toString(o.getClass().getDeclaredFields())+ "\n"
                                ).toList();

        try (BufferedWriter bw = new BufferedWriter(writer)) {
            list
                .forEach(s -> {
                    try {
                        bw.write(s);
                        bw.newLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        }
    }
}
