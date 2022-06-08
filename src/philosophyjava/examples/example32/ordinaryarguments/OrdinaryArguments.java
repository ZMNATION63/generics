package philosophyjava.examples.example32.ordinaryarguments;

import philosophyjava.examples.example32.Base;
import philosophyjava.examples.example32.Derived;
import philosophyjava.examples.example32.DerivedSetter;

public class OrdinaryArguments {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();

        DerivedSetter derivedSetter = new DerivedSetter();
        derivedSetter.set(derived);

        derivedSetter.set(base);
    }
}
