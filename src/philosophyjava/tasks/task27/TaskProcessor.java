package philosophyjava.tasks.task27;

import philosophyjava.examples.example34.throwgenericexception.Failure1;
import philosophyjava.examples.example34.throwgenericexception.Failure2;

import java.util.List;

public class TaskProcessor implements ProcessorTriple<Integer, Failure1, Failure2> {
    static int count = 6;

    @Override
    public void processE1(List<Integer> resultCollector) throws Failure1 {
        if (count-- > 1) {
            resultCollector.add(100500);
        } else {
            resultCollector.add(50);
        }
        if (count < 1) {
            throw new Failure1();
        }
    }

    @Override
    public void processE2(List<Integer> resultCollector) throws Failure2 {
        if (count-- > 1) {
            resultCollector.add(100);
        } else {
            resultCollector.add(50000);
        }
        if (count < 1) {
            throw new Failure2();
        }
    }
}
