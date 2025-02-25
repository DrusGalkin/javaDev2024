package ru.galkin.math;

public class rumArr {


    public int[] arrXYita(int...arr){
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]%2 == 0 ) arr[i] *= -1;
            if(arr[i]%2 == 1) arr[i] *= 2;

        }
        return arr;
    }

}
