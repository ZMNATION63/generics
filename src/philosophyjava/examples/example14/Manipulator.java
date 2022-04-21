package philosophyjava.examples.example14;

public class Manipulator<T extends HasF> {
    private T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }
    public void manipulate() { obj.f(); }
}
