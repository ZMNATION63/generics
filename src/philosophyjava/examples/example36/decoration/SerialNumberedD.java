package philosophyjava.examples.example36.decoration;

public class SerialNumberedD extends DecoratorD {
    private static long count = 1;
    private static final long serialNumber = count++;

    public SerialNumberedD(BasicD basicD) {
        super(basicD);
    }

    public static long getSerialNumber() {
        return serialNumber;
    }
}
