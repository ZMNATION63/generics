package philosophyjava.examples.example43.functional;

public class IntegerSubtracter implements Combiner<Integer> {
    public Integer combine(Integer x, Integer y) {
        return x - y;
    }
}
