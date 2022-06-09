package philosophyjava.tasks.task29;

/**
 *  1 = капучино,
 *  2 = с декоративной пенкой, with decorative foam
 *  3 = с шоколадом,
 *  4 = с карамелью и взбитыми сливками
 */
public enum TypeOfCoffee {
    CAPPUCCINO {
        public void action(){
            System.out.println("CAPPUCCINO");
        }
    },
    WITH_CHOCOLATE {
        public void action(){
            System.out.println("CAPPUCCINO WITH CHOCOLATE");
        }
    },
    WITH_DECORATIVE_FOAM {
        public void action(){
            System.out.println("WITH DECORATIVE FOAM");
        }
    },
    CARAMEL_AND_WHIPPED_CREAM {
        public void action(){
            System.out.println("CAPPUCCINO WITH CARAMEL AND WHIPPED CREAM");
        }
    }
}
