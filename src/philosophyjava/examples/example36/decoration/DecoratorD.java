package philosophyjava.examples.example36.decoration;

public class DecoratorD extends BasicD {
    protected BasicD basicD;

    public DecoratorD(BasicD basicD) {
        this.basicD = basicD;
    }

    public String getBasicD() {
        return this.basicD.get();
    }

    public void setBasicD(String basicD) {
        this.basicD.set(basicD);
    }
}
