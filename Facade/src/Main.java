public class Main {
    public static void main(String[] args) {
        //Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.
        PlaneFacade facade = new PlaneFacade();
        facade.takeOff();
        System.out.println("Plane flying...");
        facade.land();
        System.out.println("Plane landed");
    }
}