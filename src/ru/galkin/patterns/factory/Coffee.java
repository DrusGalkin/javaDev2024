package ru.galkin.patterns.factory;

public class Coffee {

    public void grindCoffee(){

    }

    public void makeCoffee(){

    }

    public void pourIntoCup(){

    }
}

class Americano extends Coffee {}
class Cappuccino extends Coffee {}
class CaffeLatte extends Coffee {}
class Espresso extends Coffee {}