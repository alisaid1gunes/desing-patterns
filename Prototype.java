public interface Prototype extends Cloneable {
     Object clone();
}

class Bird implements Prototype {
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

class PrototypeTest {
    public static void main(String[] args) {
        Bird bird1 = new Bird("bird1", 1);
        Bird bird2 = (Bird) bird1.clone();
        System.out.println("bird1 == bird2 : " + (bird1 == bird2));
        System.out.println("bird1.equals(bird2) : " + bird1.equals(bird2));
        System.out.println("bird1 : " + bird1);
        System.out.println("bird2 : " + bird2);
    }
}
