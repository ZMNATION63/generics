package philosophyjava.examples.example7;

import philosophyjava.examples.example6.GenericMethods;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
    public static <T>List<T> makeList(T...args) {
     List<T> list = new ArrayList<T>();
     for (T item : args) {
         list.add(item);
     }
     return list;
    }

    public static void main(String[] args) {
        List<String> list = makeList("AAA", "A");
        System.out.println(list);
        list = makeList("A AS ASSA ASS AS As AS ".split(" "));
        System.out.println(list);
    }
}
