public class RedPencil extends PencilDecorator
{


    public RedPencil(Pencil pencil) {
      super(pencil);
    }

    public String draw() {
       return super.draw()+"Red color";

    }
}
