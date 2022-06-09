package philosophyjava.examples.example35.mixins;

import philosophyjava.examples.example35.mixins.core.BasicImp;
import philosophyjava.examples.example35.mixins.core.SerialNumbered;
import philosophyjava.examples.example35.mixins.core.SerialNumberedImp;
import philosophyjava.examples.example35.mixins.core.TimeStamped;
import philosophyjava.examples.example35.mixins.core.TimeStampedImp;

public class Mixin extends BasicImp implements TimeStamped, SerialNumbered {
    private TimeStampedImp timeStampedImp = new TimeStampedImp();
    private SerialNumberedImp serialNumberedImp = new SerialNumberedImp();

    @Override
    public long getSerialNumbered() {
        return serialNumberedImp.getSerialNumbered();
    }

    @Override
    public long getStamp() {
        return timeStampedImp.getStamp();
    }
}
