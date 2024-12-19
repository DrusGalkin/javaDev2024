import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Object obj1 = new ArrayList<>();
        Object obj2 = new String("Hello");

        System.out.println(isIterable(obj1));  // true
        System.out.println(isIterable(obj2));  // false
    }

    public static boolean isIterable(Object obj) {
        if (obj instanceof Iterable) {
            try {
                Iterator<?> iterator = ((Iterable<?>) obj).iterator();
                return iterator != null;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }
}