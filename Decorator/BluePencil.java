package Decorator;

public class BluePencil extends PencilDecorator {

    public BluePencil(Pencil pencil) {
        super(pencil);
    }

    public void draw() {
        super.draw();
        System.out.println("Drawing with a blue pencil...");
    }
}
