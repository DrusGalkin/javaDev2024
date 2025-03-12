package ru.galkin.patterns.state.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
    private String name;
    private List<Order> chooseOrders;
    private Map<Order, List<Human>> list = new HashMap<>();
    private Devilery devilery;

    public Shop(String name, List<Order> chooseOrders, Devilery devilery) {
        this.name = name;
        this.devilery = devilery;
        this.devilery.setShop(this);
        this.chooseOrders = chooseOrders;
    }

    public void buyOrder(Human human, int indexOrder){
        if(human != null && indexOrder != -1){
            Order tempOrder = chooseOrders.get(indexOrder);
            int temp = human.getMoney() - tempOrder.getPrice();
            if(temp >= 0){
                human.setMoney(temp);
                tempOrder.setOrderState(OrderState.REGISTERED);
                System.out.println("ffff");
                devilery.addOrder(tempOrder, human, temp >= 0);
            }
        }
    }
}
