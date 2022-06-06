package philosophyjava.examples.example29;

import java.util.ArrayList;
import java.util.List;

/**
 * Во многих ситуациях компилятор действительно совершенно не интересует, используете ли вы сам тип или <?>.
 * В таких случаях <?> можно рассматривать как обычное украшение. Тем не менее маска все же полезна,
 * потому что она фактически говорит: «Этот код написан с учетом обобщений^уа, и здесь имеется в виду,
 * что в обобщенном параметре может передаваться любой тип».
 */
public class UnboundedWildcards1 {
    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;

    static void assign1(List list) {
        list1 = list;
        list2 = list;
        list3 = list;
        System.out.println(list1.getClass().getSimpleName()
            + " " + list2.getClass().getSimpleName()
            + " " + list3.getClass().getSimpleName());
    }

    static void assign2(List<?> list) {
        list1 = list;
        list2 = list;
        list3 = list;
        System.out.println(list1.getClass().getSimpleName()
            + " " + list2.getClass().getSimpleName()
            + " " + list3.getClass().getSimpleName());
    }

    static void assign3(List<? extends Object> list) {
        list1 = list;
        list2 = list;
        list3 = list;
        System.out.println(list1.getClass().getSimpleName()
            + " " + list2.getClass().getSimpleName()
            + " " + list3.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        assign1(new ArrayList());
        assign2(new ArrayList());
        assign3(new ArrayList());

        System.out.println("=============");
        assign1(new ArrayList<String>());
        assign2(new ArrayList<String>());
        assign3(new ArrayList<String>());

        System.out.println("=============");
        List<?> wildList = new ArrayList<>();
        wildList = new ArrayList<String>();
        assign1(wildList);
        assign2(wildList);
        assign3(wildList);
    }
}
