public class Main {
    // Factory pattern is used to create objects without exposing the creation logic to the client
    // and refer to newly created object using a common interface.
    // It is a creational pattern that uses factory methods to deal with the problem of creating objects
    // without having to specify the exact class of the object that will be created.
    // It is used when we need to create an object of any one of the multiple classes that share the same parent class.

    public static void main(String[] args) {
        Engineer javaEngineer = EngineerFactory.getEngineer("java");
        javaEngineer.work();
        Engineer phpEngineer = EngineerFactory.getEngineer("php");
        phpEngineer.work();
    }
}