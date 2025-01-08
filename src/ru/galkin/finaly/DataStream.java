package ru.galkin.finaly;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class DataStream<T> {
    private Iterable<T> list;
    private List<Function<? super T, ? extends T>> functionList;
    private List<Predicate<T>> predicateList;

    private DataStream(Iterable<T> list) {
        this.list = list;
        this.functionList = new ArrayList<>();
        this.predicateList = new ArrayList<>();
    }

    public static <T>DataStream<T> of(Iterable<T> list) {
        return (list != null) ? new DataStream(list) : (DataStream<T>) error();
    }

    public DataStream<T> map(Function<? super T, ? extends T> make) {
        functionList.add(make);
        return this;
    }

    public DataStream<T> filter(Predicate<T> filter) {
        predicateList.add(filter);
        return this;
    }

    public <R> R reduce(R identity, BiFunction<R, ? super T, R> accumulator) {
        R res = identity;

        for (T item : list) {
            boolean good = true;

            for (Predicate<T> predicate : predicateList) {
                if (!predicate.test(item)) {
                    good = false;
                    break;
                }
            }

            if (good) {
                T resItem = item;
                for(Function<? super T, ? extends T> func : functionList){
                    resItem = func.apply(resItem);
                }

                res = accumulator.apply(res, resItem);
            }
        }
        return res;
    }

    public List<T> collect() {
        List<T> res = new ArrayList<>();

        for(T item : list){
            boolean good = true;

            for(Predicate<T> predicate : predicateList){
                if(!predicate.test(item)){
                    good = false;
                    break;
                }
            }

            if(good){
                T resItem = item;
                for(Function<? super T, ? extends T> func : functionList){
                    resItem = func.apply(resItem);
                }
                res.add(resItem);
            }
        }
        return res;
    }

    private static Object error() {
        throw new ClassCastException();
    }
}
