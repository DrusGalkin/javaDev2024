package ru.galkin.patterns.state.test;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private int money;
    private String from;
    private List<Order> orderList;

    public Human(String name, int money, String from) {
        this.name = name;
        this.money = money;
        this.from = from;
        this.orderList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getFrom() {
        return from;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void addOrder(Order order){
        this.orderList.add(order);
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
