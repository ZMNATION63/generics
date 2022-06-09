package philosophyjava.examples.example36.decoration;

import java.util.Date;

public class TimeStamped extends DecoratorD {
    private final long timeStamp;

    public TimeStamped(BasicD timeStamp) {
        super(timeStamp);
        this.timeStamp = new Date().getTime();
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}
