package philosophyjava.examples.example29;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class ListOfInt {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.stream().forEach(i -> System.out.print(i + " "));
    }
}
