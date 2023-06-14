public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            return new Singleton();
        }
        return instance;
    }

}

class  SingleTonTest {
    /// Singleton pattern is used to create a single instance of a class
    /// It is a creational pattern that ensures only one object is created for a class.
    /// It is used in logging, caching, thread pools, configuration settings etc.
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1 == s2 : " + (s1 == s2));
    }
}
