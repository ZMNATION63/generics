package philosophyjava.examples.example23;

public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> boundedSolid = new Solid<>(new Bounded());
        boundedSolid.color();
        boundedSolid.getX();
        boundedSolid.weight();
    }
}
