package philosophyjava.examples.example21;

public class IntegerFactory implements FactoryI<Integer>{
    @Override
    public Integer create() {
        return new Integer(0);
    }
}
