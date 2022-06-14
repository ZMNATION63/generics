package philosophyjava.examples.example43.functional;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static philosophyjava.examples.example43.functional.Functional.filter;
import static philosophyjava.examples.example43.functional.Functional.reduce;
import static philosophyjava.examples.example43.functional.Functional.transform;

public class MultiplyingIntegerCollector implements Collector<Integer> {
    private Integer val = 1;

    @Override
    public Integer result() {
        return val;
    }

    @Override
    public Integer function(Integer x) {
        val *= x;
        return x;
    }

    //         Обобщения, списки аргументов переменной длины
    //         и упаковка работают совместно:

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Integer result = reduce(li, new IntegerAdder());

        System.out.println("------------");
        System.out.println(result);

        result = reduce(li, new IntegerSubtracter());
        System.out.println("------------");
        System.out.println(result);

        System.out.println("------------");
        System.out.println(filter(li, new GreaterThan<Integer>(4)));

        System.out.println("------------");
        System.out.println(Functional.forEach(li,
            new MultiplyingIntegerCollector()).result());

        System.out.println("------------");
        System.out.println(Functional.forEach(filter(li, new GreaterThan<Integer>(4)), new MultiplyingIntegerCollector()).result());

        MathContext mc = new MathContext(7);

        System.out.println("------------");
        List<BigDecimal> lbd = Arrays.asList(
            new BigDecimal(1.1, mc),
            new BigDecimal(2.2, mc),
            new BigDecimal(3.3, mc),
            new BigDecimal(4.4, mc));
        BigDecimal rbd = reduce(lbd, new BigDecimalAdder());
        System.out.println(rbd);

        System.out.println("------------");
        System.out.println(filter(lbd, new GreaterThan<>(new BigDecimal(3))));
//        Использование средств генерирования простых чисел BigInteger
        List<BigInteger> lbi = new ArrayList<>();
        BigInteger bi = BigInteger.valueOf(11);
        for (int i = 0; i < 11; i++) {
            lbi.add(bi);
            bi.nextProbablePrime();
        }
        System.out.println(lbi);

        System.out.println("------------");
        BigInteger rbi = reduce(lbi, new BigIntegerAdder());
        System.out.println(rbi);

        System.out.println("------------");
//        Сумма этого списка простых чисел также является простым числом:
        System.out.println(rbi.isProbablePrime(5));

        System.out.println("------------");
        List<AtomicLong> lal = Arrays.asList(
            new AtomicLong(11),
            new AtomicLong(47),
            new AtomicLong(74),
            new AtomicLong(133)
        );

        AtomicLong ral = reduce(lal, new AtomicLongAdder());
        System.out.println(ral);

        System.out.println("------------");
        System.out.println(transform(lbd,new BigDecimalUlp()));
    }
}
