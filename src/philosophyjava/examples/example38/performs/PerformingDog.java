package philosophyjava.examples.example38.performs;

public class PerformingDog extends Dog implements Performs {
    @Override
    public void speak() {
        System.out.println("WOOF-WOOF!");
    }

    @Override
    public void sit() {
        System.out.println("Sitting");
    }

    public void reproduce() {
        System.out.println("prr-wwwoooof");
    };
}
