package philosophyjava.examples.example29;

import philosophyjava.examples.example28.Holder;

public class CaptureConversion {
    static <T> void f1(Holder<T> holder) {
        T t = holder.getValue();
        System.out.println(t.getClass().getSimpleName() + " Instance = " + t);
    }

    static void f2(Holder<?> holder) {
        f1(holder);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Holder raw = new Holder<Integer>(1);
//        Выдает предупреждения
        f1(raw);
//        Без предупреждений
        f2(raw);
        Holder rawBasic = new Holder();
//        Предупреждение
        rawBasic.setValue(new Object());
        f2(rawBasic);
//        Восходящее преобразование к Holder<?>,
//        тип все равно определяется правильно:
        Holder<?> wildCarded = new Holder<Double>(1.0);
        f2(wildCarded);
    }
}
