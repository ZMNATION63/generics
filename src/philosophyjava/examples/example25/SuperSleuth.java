package philosophyjava.examples.example25;

public class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER> {
    public SuperSleuth(POWER power) {
        super(power);
    }
    void see() {power.seeThroughWalls();}
}
