package philosophyjava.examples.example37.dynamicproxymixin;

import philosophyjava.examples.example35.mixins.core.Basic;
import philosophyjava.examples.example35.mixins.core.BasicImp;
import philosophyjava.examples.example35.mixins.core.SerialNumbered;
import philosophyjava.examples.example35.mixins.core.SerialNumberedImp;
import philosophyjava.examples.example35.mixins.core.TimeStamped;
import philosophyjava.examples.example35.mixins.core.TimeStampedImp;

import static philosophyjava.examples.example37.dynamicproxymixin.Tuple.tuple;

public class DynamicProxyMixin {
    public static void main(String[] args) {
        Object mixIn = MixinProxy.newInstance(
//            tuple(new BasicImp(), BasicImp.class),
//            tuple(new TimeStampedImp(), TimeStamped.class),
//            tuple(new SerialNumberedImp(), SerialNumbered.class)
        );
        Basic b = (Basic)mixIn;
        TimeStamped timeStamped = (TimeStamped) mixIn;
        SerialNumbered serialNumbered = (SerialNumbered) mixIn;

        b.set("HELLO!");
        System.out.println(b.get());
        System.out.println(timeStamped.getStamp());
        System.out.println(serialNumbered.getSerialNumbered());
    }
}
