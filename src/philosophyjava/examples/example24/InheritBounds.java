package philosophyjava.examples.example24;

import philosophyjava.examples.example23.Bounded;

public class InheritBounds {
    public static void main(String[] args) {
        Solid2<Bounded> boundedSolid2 = new Solid2<>(new Bounded());
        boundedSolid2.color();
        boundedSolid2.getY();
        boundedSolid2.weight();
    }
}
