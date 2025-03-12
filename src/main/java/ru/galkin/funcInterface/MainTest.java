package ru.galkin.funcInterface;

import ru.galkin.math.TimeSecond;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainTest {
    public static void main(String[] args) {
        Predicate<Integer> f = x -> x < 5;
        Test<String> t = new Test<>();
        System.out.println(t.list);
        t.addPredicate(x -> x < 1);
        t.addPredicate(x -> x < 5);
//        t.pullPredicate();

        System.out.println(t.list);

        t.pullConsumer(x -> {

        });
        t.pullConsumer(x -> System.out.println(x));
    }
}

class Test<T>{
    List<Integer> list = new ArrayList<>(List.of(1,5,6,4,7,3,2,6,-1,4-3,-4-6));
    List<Predicate<Integer>> predicateList = new ArrayList<>();

    void addPredicate(Predicate<Integer> pred){
        predicateList.add(pred);
    }

    void pullPredicate(){
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < predicateList.size(); i++){
            for(Integer j : list){
                if(predicateList.get(i).test(j)) temp.add(j);
            }
        }
        list = temp;
    }

    void pullConsumer(Consumer<Integer> consumer){
        for (Integer j : list) {
            consumer.accept(j);
        }
    }
}
