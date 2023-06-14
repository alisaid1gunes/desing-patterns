public class Main {
    public static void main(String[] args) {
        //Decorator pattern is used to add new functionality to an existing object without changing its structure.
        //It is a structural pattern as this pattern acts as a wrapper to existing class.

        Pencil redPencil = new RedPencil(new BasicPencil());
        redPencil.draw();

        Pencil bluePencil = new BluePencil(new BasicPencil());
        bluePencil.draw();


    }
}