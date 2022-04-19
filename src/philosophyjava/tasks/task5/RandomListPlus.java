package philosophyjava.tasks.task5;

import philosophyjava.examples.example4.RandomList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * (1) Используйте RandomList еще с двумя типами (кроме представленного в main()).
 */
public class RandomListPlus {
    public static void main(String[] args) {
        RandomList<Integer> rl = new RandomList<>();
        for (Integer integer:new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))) {
            rl.add(integer);
        }

        for (int i = 0; i < rl.select(); i++) {
            System.out.println(rl.select() + " ");
        }
    }
}
