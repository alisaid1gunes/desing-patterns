interface Engineer {
    public void work();
}

class JavaEngineer implements Engineer {
    @Override
    public void work() {
        System.out.println("Java Engineer is working...");
    }
}

class PhpEngineer implements Engineer {
    @Override
    public void work() {
        System.out.println("Php Engineer is working...");
    }
}

class EngineerFactory {
    public static Engineer getEngineer(String type) {
        if (type.equalsIgnoreCase("java")) {
            return new JavaEngineer();
        } else if (type.equalsIgnoreCase("php")) {
            return new PhpEngineer();
        }
        return null;
    }
}

class FactoryTest {
    public static void main(String[] args) {
        Engineer javaEngineer = EngineerFactory.getEngineer("java");
        javaEngineer.work();
        Engineer phpEngineer = EngineerFactory.getEngineer("php");
        phpEngineer.work();
    }
}
