package philosophyjava.examples.example23;

public class ColoredDimension <T extends Dimension & HasColor> {
    T item;

    public ColoredDimension(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    java.awt.Color getColor() {return item.getColor();}

    int getX() { return item.x; }
    int getY() { return item.y; }
    int getZ() { return item.z; }

}
