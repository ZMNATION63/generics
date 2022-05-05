package philosophyjava.examples.example26;

import java.util.ArrayList;
import java.util.List;

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();
        fruits[1] = new Jonathan();
//        Тип времени выполнения - Apple[], а не Fruit[] и не Orange[]:
        try {
            // Компилятор позволяет добавить Fruit:
            fruits[0] = new Fruit();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            fruits[0] = new Orange(); // ArrayStoreException
        } catch (Exception e) {
            System.out.println(e);
        }

//        List<Fruit> flist = new ArrayList<Apple>();
    }
}
