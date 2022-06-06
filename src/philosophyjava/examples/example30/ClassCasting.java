package philosophyjava.examples.example30;

import philosophyjava.examples.example21.Widget;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * 565
 */
public class ClassCasting {
    @SuppressWarnings("unchecked")
    public void f(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream( new FileInputStream(args[0]));
//        Не компилируется:
//        List<Widget> lwl =
//        List<Widget>.class.cast(in.readObject());
        List<Widget> lw2 = List.class.cast(in.readObject());
    }
}
