package philosophyjava.examples.example41.fill;

import java.util.ArrayList;
import java.util.List;

public class FillTest {
    public static void main(String[] args) {
        List<Contract> contracts = new ArrayList<>();
        Fill.fill(contracts, Contract.class, 3);
        Fill.fill(contracts, FilterTransfer.class, 2);

        for (Contract contract:contracts) {
            System.out.println(contract);
        }
    }
}
