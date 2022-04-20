package philosophyjava.examples.example5;

public class Fibonacci implements Generator<Integer> {
    private int count = 0;
    
    @Override
    public Integer next() {
        return fib(count++);
    }

    private Integer fib(int i) {
        Integer res = 0;
        if (i < 2) {
            res = 1;
        } else {
            res = fib(i - 2) + fib(i - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for (int i = 0; i < 30; i++) {
            System.out.print(gen.next() + " ");
        }
    }
}
