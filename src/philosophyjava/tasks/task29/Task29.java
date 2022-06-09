package philosophyjava.tasks.task29;

import philosophyjava.examples.example5.coffee.Cappuccino;

/**
 * 38. (4) Создайте простую систему декораторов: начните с базового типа Coffee, а затем добавьте декораторы для
 * разных кофейных напитков: капучино, с декоративной пенкой, с шоколадом, с карамелью и взбитыми сливками.
 */
public class Task29 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            CappuccinoImpl cappuccino = new CappuccinoImpl(new Cappuccino());
            System.out.println("Coffee ID = " + cappuccino.cappuccino.toString());
            System.out.println("TypeOfCoffee is " + cappuccino.getTypeOfCoffee());
        }
    }
}
