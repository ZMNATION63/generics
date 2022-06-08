package philosophyjava.examples.example32.plaingenericInheritance;

import philosophyjava.examples.example32.Base;
import philosophyjava.examples.example32.Derived;

public class DerivedGS extends GenericSetter<Base> {

    void set(Derived derived) {
        System.out.println("DerivedGS.set(" + derived.getClass().getSimpleName() + ")");
    }
}
