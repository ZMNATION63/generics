package philosophyjava.examples.example10;

import java.util.EnumSet;
import java.util.Set;

public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(Watercolors.BRILLIANT_RED, Watercolors.VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE, Watercolors.BURNT_UMBER);

        System.out.print(set1);
        System.out.println("");
        System.out.print(set2);

        System.out.println(Sets.union(set1, set2));
        Set<Watercolors> subset = Sets.intersection(set1, set2);
        System.out.println("intersection(set1, set2) " + subset);

        System.out.println("difference(set1, subset) " + Sets.difference(set1, subset));
        System.out.println("difference(set2, subset) " + Sets.difference(set2, subset));

        System.out.println(Sets.complement(set1, set2));
    }
}
