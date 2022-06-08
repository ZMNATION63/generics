package philosophyjava.examples.example32.ordinaryarguments;

import philosophyjava.examples.example32.Base;

public class OrdinarySetter {
    public void set(Base base) {
        System.out.println("OrdinarySetter.set( " + base.getClass().getSimpleName() + " )");
    }
}
