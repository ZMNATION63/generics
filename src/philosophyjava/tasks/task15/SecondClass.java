package philosophyjava.tasks.task15;

public class SecondClass<T extends MainInterface> {
    public void restrictionMethodByInterface(T someData) {
        someData.method1();
        someData.method2();
        System.out.println(someData.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        firstClass.method1();
        firstClass.method2();
        firstClass.method3();
        System.out.println("---------------------------");
        SecondClass secondClass = new SecondClass();
        secondClass.restrictionMethodByInterface(new ThirdClass());
    }
}
