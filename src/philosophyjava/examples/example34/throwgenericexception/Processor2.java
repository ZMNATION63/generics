package philosophyjava.examples.example34.throwgenericexception;

import java.util.List;

public class Processor2 implements Processor<Integer, Failure2> {
    static int count = 2;
    @Override
    public void process(List<Integer> resultCollector) throws Failure2 {
        if (count-- > 1) {
            resultCollector.add(47);
        } else {
            resultCollector.add(11);
        }
        if (count < 0) {
            throw new Failure2();
        }
    }
}
