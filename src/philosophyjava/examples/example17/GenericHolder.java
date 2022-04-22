package philosophyjava.examples.example17;

public class GenericHolder<T> {
    private T objectT;

    public T getObjectT() {
        return objectT;
    }

    public void setObjectT(T objectT) {
        this.objectT = objectT;
    }

    public static void main(String[] args) {
        GenericHolder<String> stringGenericHolder = new GenericHolder<String>();
        stringGenericHolder.setObjectT("Some string");
        String str = stringGenericHolder.getObjectT();
        System.out.println(str);
    }
}
