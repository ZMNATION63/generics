package philosophyjava.examples.example16;

import java.util.ArrayList;
import java.util.List;

public class FilledListMaker<T> {
    List<T> create(T t,int size) {
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < size; i++) {
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledListMaker<String> stringFilledListMaker = new FilledListMaker<String>();
        List<String> stringList = stringFilledListMaker.create("Hello WHAAAT!!", 2);
        for (String str:stringList) {
            System.out.println(str);
        }
    }
}
