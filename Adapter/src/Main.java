public class Main {
    //Adapter pattern lets you wrap an otherwise incompatible object in an adapter to make it compatible with another class.
    //It is a structural pattern as this pattern acts as a wrapper to existing class.
    public static void main(String[] args) {
        TypeC typeC = new TypeC();
        Cable cable = new CableAdapter(typeC);
        cable.connect("iPhone");
    }
}