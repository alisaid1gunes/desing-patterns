public class PencilDecorator implements Pencil{
    protected Pencil pencil;

    public PencilDecorator(Pencil pencil) {
        this.pencil = pencil;
    }

    @Override
    public String draw() {
        return pencil.draw();
    }
}
