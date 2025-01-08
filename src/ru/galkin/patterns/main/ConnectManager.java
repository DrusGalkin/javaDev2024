package ru.galkin.patterns.main;

import javax.naming.NamingException;
import java.util.HashMap;
import java.util.Map;

public class ConnectManager {
    private final Map<String, Connect> listConnects;
    private static ConnectManager connectManager;
    private DataBase base;
    private int count;

    private ConnectManager(DataBase base){
        listConnects = new HashMap<>();
        this.base = base;
    }

    public static ConnectManager build(DataBase base){
        if(connectManager == null) connectManager = new ConnectManager(base);
        return connectManager;
    }

    public DataBase getBase() {
        return base;
    }

    public void addConnect(Connect connect){
        if(this.count < base.getNum()){
            String key = connect.getName();
            if(!listConnects.containsKey(key)) {
                listConnects.put(key, connect);
                connect.setDataBase(base);
                connect.setConnected(true);
                count++;
            } else try {
                throw new NamingException();
            } catch (NamingException e) {
                throw new RuntimeException(e);
            }
        } else throw new ArrayIndexOutOfBoundsException();
    }

    protected void removeConnect(String name){
        if(listConnects.containsKey(name)){
            listConnects.get(name).setConnected(false);
            listConnects.remove(name);
            count--;
        } else try {
            throw new NamingException();
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }

    protected void removeConnect(Connect connect){
        this.removeConnect(connect.getName());
    }

    public Connect getConnect(String name){
        if(listConnects.containsKey(name)){
            return listConnects.get(name);
        }
        return null;
    }

}
