package philosophyjava.examples.example38.performs;

public class Communicate {
    public static <T extends Performs> void perform(T perform) {
        perform.speak();
        perform.sit();
    }
}
