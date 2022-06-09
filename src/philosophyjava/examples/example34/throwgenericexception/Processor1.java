package philosophyjava.examples.example34.throwgenericexception;

import java.util.List;

public class Processor1 implements Processor<String, Failure1> {
    static int count = 3;
    @Override
    public void process(List<String> resultCollector) throws Failure1 {
        if (count-- > 1 ) {
            resultCollector.add("HEP!!!");
        } else {
            resultCollector.add("HOOOP!!");
        }

        if (count < 1) {
            throw new Failure1();
        }
    }
}
