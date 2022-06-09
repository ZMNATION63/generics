package philosophyjava.examples.example34.throwgenericexception;

public class ThrowGenericException {
    public static void main(String[] args) {
        ProcessRunner<String, Failure1> runner = new ProcessRunner<String, Failure1>();

        for (int i = 0; i < 3; i++) {
            runner.add(new Processor1());
            try {
                System.out.println(runner.processAll());
            } catch (Failure1 failure1) {
                System.out.println(failure1);
            }
        }

        ProcessRunner<Integer, Failure2> runner1 = new ProcessRunner<>();

        for (int i = 0; i < 3; i++) {
            runner1.add(new Processor2());
            try {
                System.out.println(runner1.processAll());
            } catch (Failure2 failure2) {
                System.out.println(failure2);
            }
        }
    }
}
