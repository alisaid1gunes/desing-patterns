public class EngineerFactory {
    public static Engineer getEngineer(String type) {
        if (type.equalsIgnoreCase("java")) {
            return new JavaEngineer();
        } else if (type.equalsIgnoreCase("php")) {
            return new PhpEngineer();
        }
        return null;
    }
}
