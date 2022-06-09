package philosophyjava.examples.example34.throwgenericexception;

import java.util.List;

public interface Processor <T, E extends Exception > {
    void process(List<T> resultCollector) throws E;
}
