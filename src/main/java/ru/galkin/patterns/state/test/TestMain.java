package ru.galkin.patterns.state.test;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Order> ff = List.of(new Order("Лопата", 400, "АХУЕСТЬ ЛОПАТА БЛЯТЬ", "Cаратов"));
        Devilery devilery = new Devilery();
        Shop shop = new Shop("Кракен", ff, devilery);
        Human human = new Human("Andrew", 90000, "Питер");
        shop.buyOrder(human, 0);
    }
}
