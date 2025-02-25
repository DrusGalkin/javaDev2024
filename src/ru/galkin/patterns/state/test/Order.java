package ru.galkin.patterns.state.test;

import java.util.Objects;

public class Order {
    private String name;
    private int price;
    private String description;
    private String from;
    private String where;
    private OrderState orderState;

    public Order(String name, int price, String description, String from) {
        this.name = name;
        this.price = price;
        this.from = from;
        this.description = description;
        this.orderState = OrderState.NOT_REGISTERED;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return price == order.price && Objects.equals(name, order.name) && Objects.equals(description, order.description) && orderState == order.orderState;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, orderState);
    }
}
