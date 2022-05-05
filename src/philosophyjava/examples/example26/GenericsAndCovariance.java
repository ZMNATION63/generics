package philosophyjava.examples.example26;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
    public static void main(String[] args) {
//        Маски обеспечивают ковариантность:
//        Теперь flist имеет тип List<? extends Fruit>, что можно прочитать как «список с элементами любого типа, производного от Fruit». Однако это не означает, что в List можно будет хранить любые виды Fruit. Маска относится к определенному типу, так что это означает «некоторый конкретный тип, не указанный для ссылки flist».
        List<? extends Fruit> flist = new ArrayList<Apple>(); // Ошибка компиляции; добавление объектов невозможно:
//         flist.add(new Apple());
//         flist.add(new Fruit());
//         flist.add(new Object());
        flist.add(null); // Допустимо, но неинтересно // Мы знаем, что возвращается как минимум Fruit:
        Fruit f = flist.get(0);
        System.out.println(f);
    }
}
