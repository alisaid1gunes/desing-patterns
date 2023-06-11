interface Cable {
     void connect(String phoneName);
}

class TypeC {
    public void connectWithTypeC(String phoneName) {
        System.out.println(phoneName + " is connected via TypeC cable");
    }
}

class CableAdapter implements Cable {
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

class AdapterTest {
    public static void main(String[] args) {
        TypeC typeC = new TypeC();
        Cable cable = new CableAdapter(typeC);
        cable.connect("iPhone");
    }
}