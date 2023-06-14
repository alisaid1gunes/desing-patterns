 class Jewellery {
    private String name;
    private String type;
    private String material;
    private String color;

    public Jewellery(String name, String type, String material, String color) {
        this.name = name;
        this.type = type;
        this.material = material;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Jewellery{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

class JewelleryBuilder {
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

public class Builder {

    /// Builder pattern is used to create complex objects with multiple attributes.
    /// It is a creational pattern that separates the construction of a complex object from its representation.
    /// It is used when we need to create an object step by step with a lot of flexibility.
    /// It is used when we need to create an object with a lot of optional attributes.
    public static void main(String[] args) {
        Jewellery jewellery = new JewelleryBuilder()
                .setName("Necklace")
                .setType("Necklace")
                .setMaterial("Gold")
                .setColor("Golden")
                .build();
        System.out.println(jewellery);
    }
}
