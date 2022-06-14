package philosophyjava.examples.example43.functional;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongAdder implements Combiner<AtomicLong> {
    public AtomicLong combine(AtomicLong x, AtomicLong y) {
        return new AtomicLong(x.addAndGet(y.get()));
    }
}
