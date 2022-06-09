package philosophyjava.tasks.task27;

import philosophyjava.examples.example34.throwgenericexception.Failure1;
import philosophyjava.examples.example34.throwgenericexception.Failure2;

/**
 * 36. (2) Добавьте в класс Processor второе параметризированное исключение и продемонстрируйте
 * возможность независимого изменения исключений
 */
public class Task27 {
    public static void main(String[] args) {
        TaskProcessorRunner<Integer, Failure1, Failure2> runner = new TaskProcessorRunner<Integer, Failure1, Failure2>();

        for (int i = 0; i < 3; i++) {
            runner.add(new TaskProcessor());
            try {
                System.out.println(runner.processAll());
            } catch (Failure1 | Failure2 failure1) {
                System.out.println(failure1);
            }
        }
    }
}
