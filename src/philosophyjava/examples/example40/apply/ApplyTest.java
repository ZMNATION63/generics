package philosophyjava.examples.example40.apply;

import java.util.ArrayList;
import java.util.List;

public class ApplyTest {
    public static void main(String[] args) throws NoSuchMethodException {
        List<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            shapes.add(new Shape());
        }

        Apply.apply(shapes, Shape.class.getMethod("rotate"));
        Apply.apply(shapes, Shape.class.getMethod("resize", int.class), 5);
        System.out.println("====");

        List<Square> squares = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            squares.add(new Square());
        }

        Apply.apply(squares, Shape.class.getMethod("rotate"));
        Apply.apply(squares, Shape.class.getMethod("resize", int.class), 6);
        System.out.println("====");

        Apply.apply(new FilledList<>(Shape.class, 10), Shape.class.getMethod("rotate"));
        Apply.apply(new FilledList<>(Square.class, 10), Shape.class.getMethod("resize", int.class), 100500);

    }
}
