package ru.galkin.patterns.factory;

public class CoffeeShop {
    public Coffee orderCoffee(CoffeeType type){
        Coffee coffee = null;

        switch (type){
            case ESPRESSO -> coffee = new Espresso();
            case AMERICANO -> coffee = new Americano();
            case CAPPUCCINO -> coffee = new Cappuccino();
            case CAFFE_LATTE -> coffee = new CaffeLatte();
        }
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }
}
