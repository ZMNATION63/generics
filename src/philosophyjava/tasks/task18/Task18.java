package philosophyjava.tasks.task18;

/**
 * 25. (2) Создайте два интерфейса и класс, реализующий оба интерфейса.
 * Создайте два обобщенных метода;
 * у одного параметр-тип ограничивается первым интерфейсом,
 * аудругого — вторым интерфейсом.
 *
 * Создайте экземпляр класса, который реализует оба интерфейса,
 * и покажите, что он может использоваться с обоими обобщенными методами.
 */
public class Task18 {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        classOne.genInterfaceOneMethodOne(new ClassOne());
        classOne.genInterfaceTwoMethodOne(new ClassOne());

        ClassTwo classTwo = new ClassTwo();
        classTwo.genInterfaceOneMethodOne(new ClassOne());
        classTwo.genInterfaceTwoMethodTwo(new ClassOne());
    }
}
