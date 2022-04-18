package philosophyjava.examples.example1;

public class Holder2 {
    private Object a;
    public Holder2(Object o) {
        this.a = o;
    }

    public void setA(Object a) {
        this.a = a;
    }

    public Object getA() {
        return a;
    }

    public static void main(String[] args) {
        Holder2 h2 = new Holder2(new Automobile());
        System.out.println(h2.getA());
        h2.setA("not an automobile");
        String s = (String) h2.getA();
        h2.setA(1);
        Integer i = (Integer) h2.getA();

        System.out.println(s);
        System.out.println(i);
    }
}
