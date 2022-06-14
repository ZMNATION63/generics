package philosophyjava.examples.example43.functional;

import java.math.BigDecimal;

public class BigDecimalAdder implements Combiner<BigDecimal> {
    public BigDecimal combine(BigDecimal x, BigDecimal y) {
        return x.add(y);
    }
}
