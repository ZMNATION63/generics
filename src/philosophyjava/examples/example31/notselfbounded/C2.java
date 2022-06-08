package philosophyjava.examples.example31.notselfbounded;

public class C2 extends NotSelfBounded<C2> {
    C2 setAndGet(C2 args){
        set(args);
        return get();
    }
}
