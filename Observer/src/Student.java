public class Student implements Observer{
    private String name;
    private Subject teacher;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) teacher.getUpdate(this);

        if (msg == null) {
            System.out.println(name + ":: No new message");
        } else {
            System.out.println(name + ":: Consuming message::" + msg);
        }

    }

    @Override
    public void setSubject(Subject sub) {
        this.teacher = sub;
    }
}
