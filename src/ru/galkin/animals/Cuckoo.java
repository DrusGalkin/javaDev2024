package ru.galkin.animals;

public class Cuckoo extends Birth {

    public Cuckoo(String name){
        super(name);
    }

    public void song(){
        int nums = getRand().nextInt(10);
        System.out.println(nums);
        for(int i = 0; i <= nums; i++){
            System.out.print("ку-ку ");
        }
    }
}
