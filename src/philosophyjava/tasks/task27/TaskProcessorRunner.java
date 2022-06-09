package philosophyjava.tasks.task27;

import java.util.ArrayList;
import java.util.List;

public class TaskProcessorRunner<T, X extends Exception, Z extends Exception>
    extends ArrayList<ProcessorTriple<T, X, Z>> {
    List<T> processAll() throws X, Z {
        List<T> resultCollectors = new ArrayList<>();
        for (ProcessorTriple<T, X, Z> processor : this) {
            processor.processE1(resultCollectors);
            processor.processE2(resultCollectors);
        }
        return resultCollectors;
    }
}