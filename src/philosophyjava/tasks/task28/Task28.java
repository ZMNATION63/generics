package philosophyjava.tasks.task28;

/**
 * 37. (2) Добавьте в Mixins.java новый класс примеси Colored.
 * Подмешайте его в Mixin и покажите, что программа работает.
 */
public class Task28 {
    public static void main(String[] args) {
        TaskMixin mixin = new TaskMixin();

        mixin.set("test string 1");
        mixin.setColor("GREEN");

        System.out.println(mixin.get() + " " + mixin.getStamp() + " " + mixin.getSerialNumbered() + " " + mixin.getColor());
    }
}
