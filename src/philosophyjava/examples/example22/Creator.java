package philosophyjava.examples.example22;

public class Creator extends GenericWithCreate<X>{

    @Override
    protected X create() {
        return new X();
    }

    public void foo() {
        System.out.println(element.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Creator creator = new  Creator();
        creator.foo();
    }
}
