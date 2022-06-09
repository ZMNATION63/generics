package philosophyjava.examples.example35.mixins.core;

public class SerialNumberedImp implements SerialNumbered {
    private static long counter = 1;
    private static final long serialNumber = counter++;

    @Override
    public long getSerialNumbered() {
        return serialNumber;
    }
}
