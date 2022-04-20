package philosophyjava.tasks.task7;

import philosophyjava.examples.example5.Generator;

import java.util.Iterator;
import java.util.Random;

public class StoryCharacterGenerator implements Generator<StoryCharacters>, Iterable<StoryCharacters> {
    private int size = 0;
    private Class[] type = {BadGuys.class, GoodGuys.class, BadGuys.class, GoodGuys.class};

    private static Random random = new Random(47);

    public StoryCharacterGenerator() {
    }

    public StoryCharacterGenerator(int size) {
        this.size = size;
    }

    @Override
    public Iterator<StoryCharacters> iterator() {
        return new StoryCharacters();
    }

    @Override
    public StoryCharacters next() {
        try {
            return (StoryCharacters) type[random.nextInt(type.length)].newInstance();
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException();
        }
    }

    class StoryCharactersIterator implements Iterable<StoryCharacters>, Iterator<StoryCharacters> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public StoryCharacters next() {
            count--;
            return StoryCharacterGenerator.this.next();
        }

        @Override
        public Iterator<StoryCharacters> iterator() {
            return null;
        }
    };

    public static void main(String[] args) {
        StoryCharacterGenerator generator = new StoryCharacterGenerator();
        for (int i = 0; i < 10; i++) {
            System.out.println(generator.next());
        }
        for (StoryCharacters characters : new StoryCharacterGenerator(10)) {
            System.out.println(characters);
        }
    }
}

