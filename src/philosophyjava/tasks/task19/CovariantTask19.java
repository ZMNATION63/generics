package philosophyjava.tasks.task19;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 26. (2) Продемонстрируйте ковариантность массивов на примере Number и Integer.
 * 27. (2) Покажите, что ковариантность не работает с List на примере Number и Integer, затем добавьте щаблоны.
 */
public class CovariantTask19 {
    public static void main(String[] args) {
        Number[] numbers = new Integer[10];
        numbers[0] = 4;
        numbers[1] = 2;
        try {
            for (Number number:numbers) {
                if (number != null) {
                    System.out.println(number);
                }
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }

        System.out.println("Covariant container");

        List<? extends Number> listNumbers = new ArrayList<Integer>();
//        listNumbers.add(new Integer(1));
//        listNumbers.add(new Float(12));
        listNumbers.add(null);
        try {
            System.out.println(listNumbers);
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
