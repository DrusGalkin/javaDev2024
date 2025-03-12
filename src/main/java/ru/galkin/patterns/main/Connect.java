package ru.galkin.patterns.main;

public class Connect {
    private boolean connected;
    private String name;
    private DataBase dataBase;

    public Connect(String name){
        this.name = name;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public String getElement(int i){
        if(dataBase.getList().size() < i || i < 0) {
            return null;
        }
        return dataBase.getList().get(i);
    }

    public void addElement(String el){
        dataBase.getList().add(el);
    }

    public boolean isConnected() {
        return connected;
    }

    public String getName() {
        return name;
    }

    public DataBase getDataBase() {
        return dataBase;
    }
}
