public class PlaneFacade {
    private Brakes brakes;
    private Power power;

    private LandingGear landingGear;

    private Flaps flaps;

    public PlaneFacade() {
        brakes = new Brakes();
        power = new Power();
        landingGear = new LandingGear();
        flaps = new Flaps();
    }

    public void takeOff() {
        brakes.off();
        power.on();
        landingGear.up();
        flaps.retract();
    }

    public void land() {
        flaps.extend();
        landingGear.down();
        brakes.on();
        power.off();
    }
}
