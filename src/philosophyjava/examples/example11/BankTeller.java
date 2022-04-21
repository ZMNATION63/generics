package philosophyjava.examples.example11;

import philosophyjava.examples.example8.Generators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class BankTeller {
    public static void serve(Teller teller, Customer customer) {
        System.out.println(teller + " " + customer);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        Queue<Customer> customerQueue = new LinkedList<Customer>();
        Generators.fill(customerQueue, Customer.generator(), 15);

        List<Teller> tellerList = new ArrayList<>();
        Generators.fill(tellerList, Teller.generator, 4);

        for (Customer customer:customerQueue) {
            serve(tellerList.get(random.nextInt(tellerList.size())), customer);
        }
    }
}
