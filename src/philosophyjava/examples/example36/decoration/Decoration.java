package philosophyjava.examples.example36.decoration;

public class Decoration {
    public static void main(String[] args) {
        TimeStamped timeStamped = new TimeStamped(new BasicD());
        TimeStamped timeStamped1 = new TimeStamped(new SerialNumberedD(new BasicD()));

//         t2.getSerialNumber();
//         Недоступно

        SerialNumberedD s = new SerialNumberedD(new BasicD());
        SerialNumberedD s2 = new SerialNumberedD( new TimeStamped(new BasicD()));
//        ! s2.getStamp();
//         Недоступно

    }
}
