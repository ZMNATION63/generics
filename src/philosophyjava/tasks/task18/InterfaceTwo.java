package philosophyjava.tasks.task18;

public  interface InterfaceTwo {
    <T extends InterfaceOne> void genInterfaceTwoMethodOne(T t);
    <T extends InterfaceTwo> void genInterfaceTwoMethodTwo(T t);
}
