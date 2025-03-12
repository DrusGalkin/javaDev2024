package ru.galkin.mainNew;

import ru.galkin.reflection.ex8_2.Invoke;

public class A{

    @Invoke()
    String mmm(){
        return "ffff";
    }

    @Invoke()
    float flatttt(){
        return 4.2F;
    }

    @Invoke()
    int ssd(){
        return 52;
    }
}
