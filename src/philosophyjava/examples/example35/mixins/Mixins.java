package philosophyjava.examples.example35.mixins;

public class Mixins {
    public static void main(String[] args) {
        Mixin mixin = new Mixin();
        Mixin mixin1 = new Mixin();

        mixin.set("test string 1");
        mixin1.set("test string 2");

        System.out.println(mixin.get() + " " + mixin.getStamp() + " " + mixin.getSerialNumbered());
        System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumbered());
    }
}
