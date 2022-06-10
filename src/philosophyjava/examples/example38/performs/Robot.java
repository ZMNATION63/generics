package philosophyjava.examples.example38.performs;

public class Robot implements Performs {
    @Override
    public void speak() {
        for (int i = 0; i < 2; i++) {
            System.out.println("I'm a robot, you are leather bag.");
        }
        System.out.println("HO-HO-HO");
        System.out.println("Clats");
    }

    @Override
    public void sit() {
        System.out.println("Clank!");
    }

    public void oilChange() {
        System.out.println("Clanc-Clanc tCccc");
    }
}
