package philosophyjava.examples.example32.plaingenericInheritance;

import philosophyjava.examples.example32.Base;
import philosophyjava.examples.example32.Derived;

public class PlainGenericInheritance {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedGS derivedGS = new DerivedGS();

        derivedGS.set(derived);
        derivedGS.set(base);
    }
}
