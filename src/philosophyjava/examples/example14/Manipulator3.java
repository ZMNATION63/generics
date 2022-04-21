package philosophyjava.examples.example14;

public class Manipulator3 {
    HasF hasF;

    public Manipulator3(HasF hasF) {
        this.hasF = hasF;
    }

    public void manipulate() {
        hasF.f();
    }
}
