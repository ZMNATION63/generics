package philosophyjava.tasks.task15;

public class FirstClass implements MainInterface {
    @Override
    public void method1() {
        System.out.println("FirstClass.method1()");
    }

    @Override
    public void method2() {
        System.out.println("FirstClass.method2()");
    }

    public void method3() {
        System.out.println("FirstClass.method3() inside class");
    }
}
