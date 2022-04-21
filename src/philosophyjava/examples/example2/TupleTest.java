package philosophyjava.examples.example2;

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<String, Integer>
            ("Hello 2Tuple", 007);
    }

    static ThreeTuple<Amhibian, String, Integer> g() {
        return new ThreeTuple<Amhibian, String, Integer>
            (new Amhibian(), "Hi", 007);
    }

    public static FourTuple<Vechicle, Amhibian, String, Integer> h() {
        return new FourTuple<Vechicle, Amhibian, String, Integer>
            (new Vechicle(), new Amhibian(), "Hello", 007);
    }

    static FiveTuple<Vechicle, Amhibian, String, Integer, Double> k () {
        return new FiveTuple<Vechicle, Amhibian, String, Integer, Double> (
            new Vechicle(), new Amhibian(), "String", 007, 0.1
            );
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(g());
        System.out.println(h());

    }
}
