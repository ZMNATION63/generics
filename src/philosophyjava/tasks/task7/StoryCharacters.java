package philosophyjava.tasks.task7;

import java.util.Iterator;

public class StoryCharacters implements Iterator<StoryCharacters> {
    private static long counter = 0;
    private static long id = counter++;
    public String toString() {
        return getClass().toString() + " " + id;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public StoryCharacters next() {
        return null;
    }
}
