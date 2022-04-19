package philosophyjava.tasks.task4;

import philosophyjava.examples.example3.LinkedStack;

/**
 * (2) Удалите параметр-тип класса Node и измените остальной код LinkedStack.java так,
 * чтобы показать, что для внутреннего класса доступны обобщенные параметры-типы внешнего класса.
 */
public class InnerClass<T> {
    private static class Node<T> {
        T item;
        Node<T> next;

        public Node() {
            this.item = null;
            this.next = null;
        }

        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }
        boolean end() {return item == null && next == null;}
    }

    private Node<T> top = new Node<T>();
    public void push (T item) {
        top = new Node<T>(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        InnerClass<String> lss = new InnerClass<>();
        for (String s: "Phasers on stun".split(" ")) {
            lss.push(s);
            while ((s = lss.pop()) != null) {
                System.out.println(s);
            }
        }
    }
}
