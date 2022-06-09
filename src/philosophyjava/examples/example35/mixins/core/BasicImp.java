package philosophyjava.examples.example35.mixins.core;

public class BasicImp implements Basic{
    private String val;

    @Override
    public void set(String val) {
        this.val = val;
    }

    @Override
    public String get() {
        return val;
    }
}
