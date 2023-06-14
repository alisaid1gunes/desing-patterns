public class PencilDecorator implements Pencil{
    protected Pencil pencil;

    public PencilDecorator(Pencil pencil) {
        this.pencil = pencil;
    }

    @Override
    public void draw() {
        System.out.println("Drawing with a pencil...");
    }
}
