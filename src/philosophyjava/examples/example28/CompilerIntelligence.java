package philosophyjava.examples.example28;

import philosophyjava.examples.example26.Apple;
import philosophyjava.examples.example26.Fruit;

import java.util.Arrays;
import java.util.List;

/**
 * Просматривая документацию ArrayList, мы видим, что компилятор не настолько умен.
 * Если add() получает аргумент с параметром-типом обобщения, contains() и indexOf() получают аргументы типа Object.
 * Таким образом, с объявлением ArrayList<? extends Fruit> аргумент add() превращается в ? extends Fruit.
 * По этому описанию компилятор не может узнать, какой конкретный подтип Fruit здесь нужен, и поэтому не принимает
 * никакие типы Fruit. Даже если вы предварительно выполнили восходящее преобразование Apple к Fruit, компилятор
 * просто отказывается вызывать метод (такой, как addQ), если в списке аргументов присутствует маска.
 */
public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> fruits = Arrays.asList(new Apple());
        Apple a = (Apple) fruits.get(0);
        System.out.println(a);
        System.out.println(fruits.contains(new Apple()));
        System.out.println(fruits.indexOf(new Apple()));
    }
}
