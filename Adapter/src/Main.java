public class Main {
    public static void main(String[] args) {
        TypeC typeC = new TypeC();
        Cable cable = new CableAdapter(typeC);
        cable.connect("iPhone");
    }
}