package philosophyjava.examples.example43.functional;

//     Для использования приведенных выше обобщенных методов
//     необходимо создать объекты функций для их адаптации
//     к нашим конкретным потребностям:

public class IntegerAdder implements Combiner<Integer> {
    public Integer combine(Integer x, Integer y) {
        return x + y;
    }
}
