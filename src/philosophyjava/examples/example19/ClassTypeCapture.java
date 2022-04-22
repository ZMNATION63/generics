package philosophyjava.examples.example19;

public class ClassTypeCapture<T> {
    Class<T> tClass;

    public ClassTypeCapture(Class<T> tClass) {
        this.tClass = tClass;
    }

    public boolean f(Object obj) {
        return tClass.isInstance(obj);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> cttl = new ClassTypeCapture<>(Building.class);
        System.out.println(cttl.f(new Building()));
        System.out.println(cttl.f(new House()));

        ClassTypeCapture<House> cttl1 = new ClassTypeCapture<>(House.class);
        System.out.println(cttl1.f(new Building()));
        System.out.println(cttl1.f(new House()));
    }
}
