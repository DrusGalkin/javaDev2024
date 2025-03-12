package ru.galkin.patterns.memento;

import javax.xml.crypto.Data;
import java.util.Date;

public class Project {
    private String version;
    private Date date;

    public void setVersionAndDate(String version){
        this.version = version;
        this.date = new Date();
    }

    public Save save(){
        return new Save(version);
    }

    public void load(Save save){
        this.version = save.getVersion();
        this.date = save.getDate();
    }

    @Override
    public String toString() {
        return "Проект - " + version + " " + date;
    }
}
