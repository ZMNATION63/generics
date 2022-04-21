package philosophyjava.examples.example12;

import philosophyjava.examples.example2.Amhibian;
import philosophyjava.examples.example2.FourTuple;
import philosophyjava.examples.example2.TupleTest;
import philosophyjava.examples.example2.Vechicle;

import java.util.ArrayList;

public class TupleList<A, B, C, D> extends ArrayList<FourTuple<A, B, C, D>> {
    public static void main(String[] args) {
        TupleList<Vechicle, Amhibian, String, Integer> tuple1 =
                new TupleList<Vechicle, Amhibian, String, Integer>();
        tuple1.add(TupleTest.h());
        tuple1.add(TupleTest.h());

        for (FourTuple<Vechicle, Amhibian, String, Integer> tuple:tuple1) {
            System.out.println(tuple);
        }
    }
}
