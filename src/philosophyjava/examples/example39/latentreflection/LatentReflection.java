package philosophyjava.examples.example39.latentreflection;

import philosophyjava.examples.example38.performs.Robot;

public class LatentReflection {
    public static void main(String[] args) {
        CommunicateReflectively.perform(new SmartDog());
        System.out.println("===");
        CommunicateReflectively.perform(new Robot());
        System.out.println("===");
        CommunicateReflectively.perform(new Mime());
    }
}
