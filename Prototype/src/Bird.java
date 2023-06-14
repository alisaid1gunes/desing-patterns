public class Bird implements Prototype {
    private String name;
    private int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() {
        Bird bird = null;
        try {
            bird = (Bird) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return bird;
    }

    public String toString() {
        return "Bird [name=" + name + ", age=" + age + "]";
    }

}
