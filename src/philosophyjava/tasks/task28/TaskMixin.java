package philosophyjava.tasks.task28;

import philosophyjava.examples.example35.mixins.core.BasicImp;
import philosophyjava.examples.example35.mixins.core.SerialNumbered;
import philosophyjava.examples.example35.mixins.core.SerialNumberedImp;
import philosophyjava.examples.example35.mixins.core.TimeStamped;
import philosophyjava.examples.example35.mixins.core.TimeStampedImp;

public class TaskMixin extends BasicImp implements TimeStamped, SerialNumbered, Colored {
    private TimeStampedImp timeStampedImp = new TimeStampedImp();
    private SerialNumberedImp serialNumberedImp = new SerialNumberedImp();
    private ColoredImpl colored = new ColoredImpl();

    @Override
    public long getSerialNumbered() {
        return serialNumberedImp.getSerialNumbered();
    }

    @Override
    public long getStamp() {
        return timeStampedImp.getStamp();
    }

    @Override
    public void setColor(String color) {
        colored.setColor(color);
    }

    @Override
    public String getColor() {
        return colored.getColor();
    }
}
