public class Main {
    public static void main(String[] args) {
        // Proxy pattern is used to provide a surrogate or placeholder object to control access to another object.
        // It is a structural pattern that creates a proxy object which acts as a substitute for a real object used by a client.

        Soldier general = new General("Said", "General");
        Soldier private1 = new Private("Ahmed", "Private");

        String request = "fight";

        general.work(request);
        private1.work(request);

        request = "command";

        general.work(request);
        private1.work(request);

    }
}