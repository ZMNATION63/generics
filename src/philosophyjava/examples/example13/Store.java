package philosophyjava.examples.example13;

import java.util.ArrayList;

public class Store extends ArrayList<Aisle> {
    private ArrayList<CheckoutStand> checkouts = new ArrayList<>();
    private Office office = new Office();

    public Store(int nAisles, int nShalves, int nProducts) {
        for (int i = 0; i < nAisles; i++) {
            add(new Aisle(nShalves, nProducts));
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Aisle aisle:this) {
            for (Shelf shelf :aisle) {
                for (Product product:shelf) {
                    stringBuilder.append(product);
                    stringBuilder.append("\n");
                }
            }
        }
        return "Store{}";
    }

    public static void main(String[] args) {
        System.out.println(new Store(14, 5, 10));
    }
}
