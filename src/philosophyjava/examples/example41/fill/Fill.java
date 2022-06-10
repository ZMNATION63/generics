package philosophyjava.examples.example41.fill;

import java.util.Collection;

/**
 * Не работает с "любым объектом, содержащим add()". Интерфейса
 * "Addable'' не существует, так что приходится использовать
 * Collection. В данном случае полноценное обобщение невозможно.
 */
public class Fill {
    public static <T> void fill(Collection<T> collection, Class<? extends T> classToken, int size) {
        for (int i = 0; i < size; i++) {
//             Предполагается наличие конструктора по умолчанию:
            try {
                collection.add(classToken.newInstance());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
