package philosophyjava.tasks.task18;

public class ClassOne implements InterfaceOne, InterfaceTwo {
    @Override
    public <T extends InterfaceOne> void genInterfaceOneMethodOne(T t) {
        System.out.println(this.getClass().getSimpleName() + " genInterfaceOneMethodOne");
    }

    @Override
    public <U extends InterfaceTwo> void genInterfaceOneMethodTwo(U u) {
        System.out.println(this.getClass().getSimpleName() + " genInterfaceOneMethodTwo");
    }

    @Override
    public <T extends InterfaceOne> void genInterfaceTwoMethodOne(T t) {
        System.out.println(this.getClass().getSimpleName() + " genInterfaceTwoMethodOne");
    }

    @Override
    public <T extends InterfaceTwo> void genInterfaceTwoMethodTwo(T t) {
        System.out.println(this.getClass().getSimpleName() + " genInterfaceTwoMethodTwo");
    }
}
