package philosophyjava.examples.example32;

import philosophyjava.examples.example32.ordinaryarguments.OrdinaryGetter;

public interface DerivedGetter extends OrdinaryGetter {
//     Возвращаемый тип переопределенного метода может изменяться:
    Derived get();
}
