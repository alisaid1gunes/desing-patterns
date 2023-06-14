public class CableAdapter implements Cable {
    private TypeC typeC;

    public CableAdapter(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void connect(String phoneName) {
        if (phoneName.equalsIgnoreCase("iPhone")) {
            typeC.connectWithTypeC(phoneName);
        }
    }
}
