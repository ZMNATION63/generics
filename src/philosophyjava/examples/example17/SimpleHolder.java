package philosophyjava.examples.example17;

public class SimpleHolder {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        SimpleHolder simpleHolder = new SimpleHolder();
        simpleHolder.setObject("OMG This is STRING!!!");
        String str = (String) simpleHolder.getObject();
        System.out.println(str);
    }
}
