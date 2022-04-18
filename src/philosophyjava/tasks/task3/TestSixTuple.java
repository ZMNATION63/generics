package philosophyjava.tasks.task3;

import philosophyjava.examples.example2.Amhibian;
import philosophyjava.examples.example2.Vechicle;

import java.math.BigInteger;

public class TestSixTuple {
    public static void main(String[] args) {
        SixTuple<String, Integer, Double, BigInteger, Vechicle, Amhibian>
            s = new SixTuple<String, Integer, Double, BigInteger, Vechicle, Amhibian>
            ("STRINGA", 127, 127.2, BigInteger.valueOf(9163321134613293400L),
            new Vechicle(), new Amhibian());
        System.out.println(s);
    }
}
