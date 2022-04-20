package philosophyjava.tasks.task8;

/**
 * 9. (1) Измените пример GenericMethods.java, чтобы метод f() получал три аргумента,
 *  относящихся к разным параметризованным типам.
 * 10. (1) Измените предыдущее упражнение так, чтобы один из аргументов^() был не- параметризованным.
 */
public class GenericMethodsTask {
    public <T, B, F> void fx(T t, B b, F f) {
        System.out.println(t.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(f.getClass().getName());
    }
    public <T, B> void fk(Integer z, T t, B b) {
        System.out.println(t.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(z.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethodsTask task = new GenericMethodsTask();
        task.fk(1, 'C', "String");
        task.fx("q", 1l, 2.0);
    }
}
