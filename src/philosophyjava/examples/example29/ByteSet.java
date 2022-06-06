package philosophyjava.examples.example29;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ByteSet {
    static Byte[] bytes = {1,2,3,4,5,6,7,8,9};
    static Set<Byte> byteSet = new HashSet<Byte>(Arrays.asList(bytes));
//    Но такая запись невозможна:
    //    Set<Byte> mySet2 = new HashSet<Byte>(
    //    Arrays.<Byte>asList(l,2,3,4,5,6,7,8,9));
    public static void main(String[] args) {
        byteSet.stream().forEach(b -> System.out.print(b + " "));
    }
}
