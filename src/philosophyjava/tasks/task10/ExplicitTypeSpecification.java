package philosophyjava.tasks.task10;

import philosophyjava.tasks.task9.New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExplicitTypeSpecification {
    static void f(Map<String, List<Integer>> stringListMap) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12,212,1312));
        stringListMap.put("qwe", list);
        System.out.println(stringListMap.size());
        System.out.println(stringListMap.values());
    };

    public static void main(String[] args) {
        f(New.<String, List<Integer>>map());
    }
}
