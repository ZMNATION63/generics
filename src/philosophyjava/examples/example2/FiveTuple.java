package philosophyjava.examples.example2;

public class FiveTuple <A, B, C, D, E> extends FourTuple<A, B, C, D> {
    public final E fiveth;

    public FiveTuple(A first, B second, C third, D fourth, E fiveth) {
        super(first, second, third, fourth);
        this.fiveth = fiveth;
    }

    @Override
    public String toString() {
        return "FiveTuple{" + "fiveth=" + fiveth + ", fourth=" + fourth + ", third=" + third + ", first=" + first
            + ", second=" + second + '}';
    }
}
