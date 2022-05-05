package philosophyjava.examples.example24;

import philosophyjava.examples.example23.HasColor;

public class Colored2<T extends HasColor> extends HoldItem<T>{

    public Colored2(T item) {
        super(item);
    }

    java.awt.Color color() {return item.getColor();}
}
