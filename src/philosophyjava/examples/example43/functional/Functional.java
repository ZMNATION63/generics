package philosophyjava.examples.example43.functional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

//         Получает объект функции и вызывает его для каждого объекта
//         в списке, игнорируя возвращаемое значение. Объект
//         функции может действовать как параметр-накопитель,
//         поэтому он возвращается в конце
    public static <T> Collector<T> forEach(Iterable<T> seq, Collector<T> func) {
        for (T t : seq) {
            func.function(t);
        }
        return func;
    }

//     Создает список результатов, вызывая объект функции
//     для каждого объекта в списке
    public static <R,T> List<R> transform(Iterable<T> seq, UnaryFunction<R,T> func) {
        List<R> result = new ArrayList<>();
        for (T t:seq) {
            result.add(func.function(t));
        }
        return result;
    }

//     Применяет унарный предикат к каждому элементу последовательности
//     и возвращает список элементов, для которых
//     было получено значение "true":
    public static <T> List<T> filter(Iterable<T> seq, UnaryPredicate<T> pred) {
        List<T> list = new ArrayList<>();
        for (T t:seq) {
            if (pred.test(t)) {
                list.add(t);
            }
        }
        return list;
    }
}
