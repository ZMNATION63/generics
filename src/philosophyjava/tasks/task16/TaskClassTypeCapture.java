package philosophyjava.tasks.task16;

import java.util.HashMap;
import java.util.Map;

/**
 * fixme
 *  - 21. (4) Измените пример ClassTypeCapture.java: добавьте в него контейнер Map<String,Class<?>>,
 *  - мeтoд addType(String typename, Class<?> kind)
 *  - createNew(String typename).
 *  - Метод createNew() либо создает новый экземпляр класса, связанный с аргументом-строкой,
 *  - либо выводит сообщение об ошибке.
 */
public class TaskClassTypeCapture<T> {
    private Map<String,Class<?>> kindMap = new HashMap<String,Class<?>>();
    public void addType(String name , Class<?> klass) {
        kindMap.put(name, klass);
    }
    public boolean find(Object arg) {
        for (Class<?> c : kindMap.values()) {
            if (c.isInstance(arg)) {
                return true;
            }
        }
        return false;
    }
    public Object createNew(String typename) {
        if (!kindMap.containsKey(typename)) {
            throw new IllegalArgumentException("I didn't find " + typename + " !");
        }
        try {
            return kindMap.get(typename).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
