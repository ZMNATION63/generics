package philosophyjava.examples.example24;

import philosophyjava.examples.example23.Dimension;
import philosophyjava.examples.example23.HasColor;
import philosophyjava.examples.example23.Weight;

public class Solid2 <T extends Dimension & HasColor & Weight> extends ColoredDimension2<T>{

    public Solid2(T item) {
        super(item);
    }

    int weight() {
        return item.weight();
    }
}
