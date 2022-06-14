package philosophyjava.examples.example43.functional;

import java.math.BigInteger;

public class BigIntegerAdder implements Combiner<BigInteger> {
    public BigInteger combine(BigInteger x, BigInteger y) {
        return x.add(y);
    }
}
