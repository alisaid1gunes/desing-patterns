public class Main {
    public static void main(String[] args) {
        // Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically.
        // Observer pattern falls under behavioral pattern category.

        Teacher teacher = new Teacher();

        Student student1 = new Student("Student 1");
        Student student2 = new Student("Student 2");
        Student student3 = new Student("Student 3");

        teacher.register(student1);
        teacher.register(student2);
        teacher.register(student3);

        student1.setSubject(teacher);
        student2.setSubject(teacher);
        student3.setSubject(teacher);

        student1.update();

        teacher.postMessage("New Message");


    }
}