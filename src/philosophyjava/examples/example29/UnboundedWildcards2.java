package philosophyjava.examples.example29;

import java.util.HashMap;
import java.util.Map;

/**
 * Если обобщение состоит только из неограниченных масок, как Мар<?, ?>, компилятор, похоже, не отличает
 * его от «обычного» типа Мар. Кроме того, UnboundedWildcardsl.java показывает, что компилятор по-разному
 * рассматривает List<?> и List<? extends Object>. При этом компилятор не всегда обращает внимание на различия
 * между, допустим, List и List<?>; создается впечатление, что это одно и то же, а это может породить путаницу.
 * В самом деле, поскольку обобщенный аргумент стирается до первого ограничения, List<?> кажется эквивалентом
 * List<object>, а List по сути тоже является List<Object> — впрочем, оба эти утверждения не совсем точны.
 * List в действительности означает «неспециализированный контейнер List, в котором могут храниться любые объекты
 * Object», тогда как List<?> означает «специализация List для конкретного типа, который нам неизвестен».
 */
public class UnboundedWildcards2 {
    static Map map1;
    static Map<?,?> map2;
    static Map<String,?> map3;

    static void assign1(Map map) {
        map1 = map;
    }

    static void assign2(Map<?,?> map) {
        map2 = map;
    }

    static void assign3(Map<String, ?> map) {
        map3 = map;
    }

    public static void main(String[] args) {
        assign1(new HashMap());
        assign2(new HashMap());
//        assign3(new HashMap());
//         Предупреждение:
//         Неконтролируемое преобразование. Обнаружен: HashMap
//         Требуется: Map<String,?>
        assign1(new HashMap<String, Integer>());
        assign2(new HashMap<String, Integer>());
        assign3(new HashMap<String, Integer>());
    }
}
