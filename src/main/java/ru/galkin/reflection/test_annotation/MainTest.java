package ru.galkin.reflection.test_annotation;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class MainTest {
    public static void main(String... aa) {

    }
}

@NormalVandalZakinylKoleso(count = 10)
class D{

}


interface WOMAN {
    String getName();
}

class ЯнаХеймен implements WOMAN {
    String name = "Яна";

    public String getName() {
        return name;
    }
}


class TGBotSkidevatelPenicov extends Thread {
    WOMAN[] women;

    TGBotSkidevatelPenicov(WOMAN... women) {
        this.women = women;
    }

    @Override
    public void run() {
        super.run();
        AtomicInteger a = new AtomicInteger(0);
        for (; ; )
            Arrays.stream(women).forEach(b -> System.out.println(b.getName() + " ПИСЮН №" + a.incrementAndGet()));
    }
}

@OnePiece(value = "g")
class Bib {
    @OnePiece("OOO")
    String c;
}
