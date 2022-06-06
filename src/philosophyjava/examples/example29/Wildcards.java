package philosophyjava.examples.example29;

import philosophyjava.examples.example28.Holder;

public class Wildcards {
    // Неспециализированный аргумент:
    static void rawArgs(Holder holder, Object args) {
        holder.setValue(args);
//        Предупреждение:
//        Неконтролируемый вызов set(T) как члена
//        неспециализированного типа Holder
//        holder.set(new Wildcards());
//        То же предупреждение
//        Невозможно - 'T' отсутствует:
//        T t = holder.get();
//        Допустимо, но информация типа теряется:
        Object obj = holder.getValue();
    }

//    Аналогично rawArgs(), но с выдачей ошибок вместо предупреждений
    static void unboundedArg(Holder<?> holder, Object arg) {
//        holder.set(arg);
//        Ошибка:
//        set(capture of ?) в Holder<capture of ?>
//        не может применяться к (Object) holder.set(new Wildcards());
//        Та же ошибка
//        Невозможно - 'T' отсутствует:
//        T t = holder.get();
//        Допустимо, но информация типа теряется:
        Object obj = holder.getValue();
    }

    static <T> T exact1(Holder<T> holder) {
        T t = holder.getValue();
        return t;
    }

    static <T> T exact2(Holder<T> holder, T arg) {
        holder.setValue(arg);
        T t = holder.getValue();
        return t;
    }

    static <T> T wildSubType(Holder<? extends T> holder, T arg) {
//        holder.set(arg);
//        Ошибка:
//        set(capture of ? extends T) в
//        Holder<capture of ? extends T>
//        не может применяться к (T)
        T t = holder.getValue();
        return t;
    }

    static <T> void wildSupertype(Holder<? super T> holder, T arg) {
        holder.setValue(arg);
//        T t = holder.getValue();
//        Ошибка:
//        Несовместимые типы : обнаружен Object, требуется T
//        Допустимо, но информация типа теряется:
        Object obj = holder.getValue();
    }

    public static void main(String[] args) {
        Holder holder = new Holder<Long>();
        Holder<Long> qualified = new Holder<Long>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? super Long> bounded = new Holder<Long>();

        Long aLong = 1L;

        rawArgs(holder, aLong);
        rawArgs(qualified, aLong);
        rawArgs(unbounded, aLong);
        rawArgs(bounded, aLong);

        unboundedArg(holder, aLong);
        unboundedArg(qualified, aLong);
        unboundedArg(unbounded, aLong);
        unboundedArg(bounded, aLong);

//        Object rl = exactl(raw);
//        Предупреждения:
//        Неконтролируемое преобразование Holder в Holder<T>
//        Неконтролируемый вызов метода: exactl(Holder<T>)
//        применяется к (Holder)
        Long r2 = exact1(qualified);
//        Должен вернуть Object
        Object r3 = exact1(unbounded);
        Long r4 = (Long) exact1(bounded);
//        Long г5 = exact2(raw, lng);
//        Предупреждения:
//        Неконтролируемое преобразование Holder в Holder<Long>
//        Неконтролируемый вызов метода: exact2(Holder<T>,T)
//        применяется к (Holder^Long)
        Long r6 = exact2(qualified, aLong);
//        Long r7 - exact2(unbounded> lng);
//        Ошибка:
//        exact2(Holder<T>,T) не может применяться
//        к (Holder<capture of ?>,Long)
//        Long r8 = exact2(bounded, lng);
//        Ошибка:
//        exact2(Holder<T>,T) не может применяться
//        к (Holder<capture of ? extends Long>jLong)
//        Long r9 = wildSubtype(raw, lng);
//        Предупреждения:
//        Неконтролируемое преобразование Holder
//        в Holder<? extends Long>
//        Неконтролируемый вызов метода:
//        wildSubtype(Holder<? extends T>,T)
//        применяется к (Holder,Long)
        Long r10 = wildSubType(qualified, aLong);
//         Допустимо но может возвращать только Object:
        Object r11 = wildSubType(unbounded, aLong);
        Long r12 = (Long) wildSubType(bounded, aLong);

//        wildSupertype(raw, lng);
//        Предупреждения:
//        Неконтролируемое преобразование Holder
//        в Holder<? super Long>
//        Неконтролируемый вызов метода:
//        wildSupertype(Holder<? super T>,T)
//        применяется к (Holder,Long)
        wildSupertype(qualified, aLong);
//        wildSupertype(unbounded, lng);
//        Ошибка:
//        wildSupertype(Holder<? super T>jT) не может
//        применяться к (Holder<capture of ?>,Long)
//        wildSupertype(bounded, lng);
//        Ошибка:
//        wildSupertype(Holder<? super T>,T) не может
//        применяться к (Holder<capture of ? extends Long>jLong)
    }
}
