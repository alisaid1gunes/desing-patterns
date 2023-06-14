public class JewelleryBuilder {
    private String name;
    private String type;
    private String material;
    private String color;

    public JewelleryBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public JewelleryBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public JewelleryBuilder setMaterial(String material) {
        this.material = material;
        return this;
    }

    public JewelleryBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Jewellery build() {
        return new Jewellery(name, type, material, color);
    }
}
