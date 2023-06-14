public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1 == s2 : " + (s1 == s2));

        SingletonLazy s3 = SingletonLazy.getInstance();
        SingletonLazy s4 = SingletonLazy.getInstance();
        System.out.println("s3 == s4 : " + (s3 == s4));
    }
}