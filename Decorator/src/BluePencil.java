public class BluePencil extends PencilDecorator {

    public BluePencil(Pencil pencil) {
        super(pencil);
    }

    public String draw() {
       return super.draw()+"Blue color";

    }
}
