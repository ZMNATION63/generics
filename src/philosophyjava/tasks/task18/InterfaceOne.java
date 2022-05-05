package philosophyjava.tasks.task18;

public interface InterfaceOne {
    <T extends InterfaceOne> void genInterfaceOneMethodOne(T t);
    <U extends InterfaceTwo> void genInterfaceOneMethodTwo(U u);
}
