public class SingletonLazy {
    private static SingletonLazy instance = null;

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            return new SingletonLazy();
        }
        return instance;
    }
}

class SingleTonLazyTest {
    // This is a lazy implementation of Singleton pattern
    // It is used when the Singleton class is heavy and loaded at runtime
    public static void main(String[] args) {
        SingletonLazy s1 = SingletonLazy.getInstance();
        SingletonLazy s2 = SingletonLazy.getInstance();
        System.out.println("s1 == s2 : " + (s1 == s2));
    }
}