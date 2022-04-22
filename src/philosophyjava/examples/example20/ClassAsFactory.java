package philosophyjava.examples.example20;

import org.omg.SendingContext.RunTime;

public class ClassAsFactory<T> {
    T x;

    public ClassAsFactory(Class<T> x) {
        try {
            this.x = x.newInstance();
        } catch (Exception exception) {
            throw new RuntimeException();
        }
    }
}
