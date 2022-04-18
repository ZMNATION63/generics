package philosophyjava.tasks.task3;

import philosophyjava.examples.example2.FiveTuple;

/**
 * 3. (1) Создайте и протестируйте обобщенный тип SixTuple для шести элементов.
 */
public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
    public final F six;

    public SixTuple(A first, B second, C third, D fourth, E fiveth, F six) {
        super(first, second, third, fourth, fiveth);
        this.six = six;
    }

    @Override
    public String toString() {
        return "SixTuple{" + "fiveth=" + fiveth + ", fourth=" + fourth
            + ", third=" + third + ", first=" + first
            + ", second=" + second + ", six=" + six + '}';
    }
}
