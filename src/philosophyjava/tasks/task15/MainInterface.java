package philosophyjava.tasks.task15;

/**
 * (1)
 * todo - done Создайте интерфейс с двумя методами и класс, который реализует этот интерфейс и добавляет еще один метод.
 * todo В другом классе создайте обобщенный метод с аргументом-типом, ограниченным по интерфейсу;
 * todo покажите, что методы интерфейса могут вызываться в этом обобщенном методе.
 * todo В main() передайте экземпляр реализующего класса обобщенному методу.
 */
public interface MainInterface {
    default void method1() {
        System.out.println("mainInterface.method1()");
    };
    default void method2() {
        System.out.println("mainInterface.method2()");
    };
}
