package philosophyjava.tasks.task27;

import philosophyjava.examples.example34.throwgenericexception.Failure1;
import philosophyjava.examples.example34.throwgenericexception.Failure2;

import java.util.List;

public interface ProcessorTriple <T, X extends Exception, Z extends Exception>{
    void processE1(List<T> resultCollector) throws X;
    void processE2(List<T> resultCollector) throws Z;
}
