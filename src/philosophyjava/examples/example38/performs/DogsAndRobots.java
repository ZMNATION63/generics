package philosophyjava.examples.example38.performs;

public class DogsAndRobots {
    public static void main(String[] args) {
        Robot robot = new Robot();
        PerformingDog performingDog = new PerformingDog();

        Communicate.perform(robot);
        System.out.println("==========");
        Communicate.perform(performingDog);
    }
}
