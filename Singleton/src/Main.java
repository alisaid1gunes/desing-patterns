public class Main {
    public static void main(String[] args) {
        //Singleton pattern is used to create only one instance of an object and provide global access to it.
        //It is a creational pattern as this pattern provides a way to instantiate an object while making sure that only single object gets created.
        //Singleton pattern is used for logging, drivers objects, caching and thread pool.
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1 == s2 : " + (s1 == s2));

        SingletonLazy s3 = SingletonLazy.getInstance();
        SingletonLazy s4 = SingletonLazy.getInstance();
        System.out.println("s3 == s4 : " + (s3 == s4));
    }
}