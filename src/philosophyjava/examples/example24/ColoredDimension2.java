package philosophyjava.examples.example24;

import philosophyjava.examples.example23.Dimension;
import philosophyjava.examples.example23.HasColor;

/**
 * По сути множественное наследование.
 * @param <T>
 */
public class ColoredDimension2<T extends Dimension & HasColor> extends Colored2<T>{

    public ColoredDimension2(T item) {
        super(item);
    }

    int getX() { return item.x; }
    int getY() { return item.y; }
    int getZ() { return item.z; }
}
