package philosophyjava.examples.example25;

import java.util.List;

public class EpicBattle {
//    Ограничения в обобщенных методах:
    static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNoises();
    }

    static <POWER extends SuperHearing & SuperSmell> void superFind(SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNoises();
        hero.getPower().trackBySmell();
    }
//не догоню почему SuperHearSmell подходит в двух случаях
    public static void main(String[] args) {
        DogBoy dogBoy = new DogBoy(new SuperHearSmell());
        useSuperHearing(dogBoy);
        superFind(dogBoy);

        // Так поступить можно:
        List<? extends SuperHearing> audioBoys;
        // А так нельзя:
        // List<? extends SuperHearing & SuperSmell> dogBoys;
    }
}
