package philosophyjava.tasks.task28;

public class ColoredImpl implements Colored{
    private static String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
