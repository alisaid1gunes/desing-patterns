public class RedPencil extends PencilDecorator
{


    public RedPencil(Pencil pencil) {
      super(pencil);
    }

    public void draw() {
        super.draw();
        System.out.println("Drawing with a red pencil...");
    }
}
