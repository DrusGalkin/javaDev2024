package ru.galkin.patterns.pinf22;

public class OtherKupe extends Kupe{
    public OtherKupe(int maxHuman) {
        super(maxHuman);
    }

    @Override
    public void addHuman(Human human) {
        try{
            super.addHuman(human);
        }catch (IllegalArgumentException e){
            System.out.println("Купе подругому, но уже все кароч, много людей");
        }
    }
}
