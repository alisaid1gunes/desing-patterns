public class Main {
    public static void main(String[] args) {
        // Builder pattern is used to create complex objects with multiple attributes.
        // It is a creational pattern that separates the construction of a complex object from its representation.
        // It is used when we need to create an object step by step with a lot of flexibility.
        // It is used when we need to create an object with a lot of optional attributes.
        Jewellery jewellery = new JewelleryBuilder()
                .setName("Necklace")
                .setType("Necklace")
                .setMaterial("Gold")
                .setColor("Golden")
                .build();
        System.out.println(jewellery);
    }
}