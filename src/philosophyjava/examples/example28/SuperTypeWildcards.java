package philosophyjava.examples.example28;

import philosophyjava.examples.example26.Apple;
import philosophyjava.examples.example26.Fruit;
import philosophyjava.examples.example26.Jonathan;

import java.util.List;

public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
//        Jonathan extends Apple
        apples.add(new Jonathan());
        /**
         * Также можно пойти другим путем и использовать ограничения супертипа. В этом случае разработчик устанавливает
         * ограничение по любому базовому классу некоторого классаконструкцией<? super Мус1а55>илидажепараметру-типу:
         * <? super т>(хотя вы не сможете задать ограничение супертипа для обобщенного параметра, то есть конструкция
         * <T super MyClass> запрещена). Это позволяет безопасно передать типизованный объект обобщенному типу.
         * Таким образом, ограничение супертипа делает возможной запись в Collection:
         */
        //        apples.add(new Fruit());
    }
}
