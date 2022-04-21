package philosophyjava.tasks.task13;

import philosophyjava.examples.example8.Generators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class GeneratorFishEaten {
    public static void eaten(BigFish bigFish, SmallFish smallFish) {
        System.out.println(bigFish + " eat " + smallFish);
    }

    public static void main(String[] args) {
        Random random = new Random(74);
        Queue<SmallFish> smallFishQueue = new LinkedList<>();
        Generators.fill(smallFishQueue, SmallFish.generator, 15);

        List<BigFish> bigFishList = new ArrayList<>();
        Generators.fill(bigFishList, BigFish.generator(), 4);

        for (SmallFish smallFish:smallFishQueue) {
            eaten(bigFishList.get(random.nextInt(bigFishList.size())), smallFish);
        }
    }
}
