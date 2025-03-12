package ru.galkin.patterns.state.test;

import java.util.HashMap;
import java.util.Map;

public class Devilery {
    private Map<Order, Human> ordersAndHumans = new HashMap<>();
    private Shop shop;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Map<Order, Human> getOrdersAndHumans() {
        return new HashMap<>(ordersAndHumans);
    }

    public void addOrder(Order order, Human human, boolean checkMoney){
        if(order != null && human != null){
            ordersAndHumans.put(order, human);

            order.setWhere(human.getFrom());
            while(checkMoney){
                order.setOrderState(order.getOrderState().check(order));
                if(order.getOrderState()== OrderState.WHERE) {
                    human.addOrder(order);
                    order.getOrderState().check(order);
                    order.setOrderState(OrderState.NOT_REGISTERED);
                    break;
                }
            }
        }
    }
}
