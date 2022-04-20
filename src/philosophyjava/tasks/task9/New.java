package philosophyjava.tasks.task9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * 11. (1) Протестируйте пример New.java;
 * создайте собственные классы и убедитесь в том,
 * что класс New правильно работает с ними.
 */
public class New {
    public static <K,V> Map<K,V> map() {
        return new HashMap<K, V>();
    }

    public static <L> List<L> list() {
        return new ArrayList<L>();
    }

    public static <K> LinkedList<K> linkedList() {
        return new LinkedList<K>();
    }

    public static <T> Set<T> set() {
        return new HashSet<T>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<>();
    }

    public static void main(String[] args) {
        Map<String, Integer> map = New.map();
        List<String> list = New.list();
        LinkedList<Integer> linkedList = New.linkedList();
        Set<String> set = New.set();
        Queue<String> queue = New.queue();

        map.put("first in map key", 12333);
        list.add("first in list added");
        linkedList.add(123);
        linkedList.add(321);
        set.add("first in set");
        queue.add("qweewq");

        System.out.println(map.values());
        System.out.println(list.get(0));
        System.out.println(linkedList.get(0));
        System.out.println(set);
        System.out.println(queue);

    }
}
