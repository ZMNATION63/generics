package philosophyjava.tasks.task29;

import philosophyjava.examples.example5.coffee.Cappuccino;

import java.util.Random;

public class CappuccinoImpl extends Cappuccino {
    protected Cappuccino cappuccino;
    protected TypeOfCoffee typeOfCoffee;
    private Random random;

    public CappuccinoImpl(Cappuccino cappuccino) {
        this.cappuccino = cappuccino;

        setTypeOfCoffee();
    }

    public TypeOfCoffee getTypeOfCoffee() {
        return typeOfCoffee;
    }

    public void setTypeOfCoffee() {
        random = new Random();
        int typeNumber = random.nextInt(4);
        switch (typeNumber) {
            case 0:
                this.typeOfCoffee = TypeOfCoffee.CAPPUCCINO;
                break;
            case 1:
                this.typeOfCoffee = TypeOfCoffee.WITH_CHOCOLATE;
                break;
            case 2:
                this.typeOfCoffee = TypeOfCoffee.WITH_DECORATIVE_FOAM;
                break;
            case 3:
                this.typeOfCoffee = TypeOfCoffee.CARAMEL_AND_WHIPPED_CREAM;
                break;
        }
    }
}
