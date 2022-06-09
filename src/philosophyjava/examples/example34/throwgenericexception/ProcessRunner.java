package philosophyjava.examples.example34.throwgenericexception;

import java.util.ArrayList;
import java.util.List;

public class ProcessRunner<T, E extends Exception> extends ArrayList<Processor<T, E>> {
    List<T> processAll() throws E {
        List<T> resultCollectors = new ArrayList<>();
        for (Processor<T, E> processor : this) {
            processor.process(resultCollectors);
        }
        return resultCollectors;
    }
}
