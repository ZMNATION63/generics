package philosophyjava.examples.example43.functional;

import java.util.Iterator;

/**
 * Вызывает объект Combiner для каждого элемента,
 * чтобы объединить его с накапливаемым результатом,
 * который в конечном итоге возвращается
 */
public class Functional {
    public static <T> T reduce(Iterable<T> seq, Combiner<T> combiner) {
        Iterator<T> it = seq.iterator();
        if (it.hasNext()) {
            T result = it.next();
            while (it.hasNext()) {
                result = combiner.combine(result, it.next());
            }
            return result;
        }
        return null;
    }

//     Получает объект функции и вызывает его для каждого объекта
//     в списке, игнорируя возвращаемое значение. Объект
//     функции может действовать как параметр-накопитель,
//     поэтому он возвращается в конце,

}
