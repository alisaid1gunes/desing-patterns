public class Soldier {
    private String name;
    private String rank;

    private ProxyManager proxyManager;

public Soldier(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public void work(String request) {
    proxyManager = new ProxyManager();
        if (request.equalsIgnoreCase("fight")) {
            proxyManager = new ProxyManager();
            proxyManager.fight(this);
        } else if (request.equalsIgnoreCase("command")) {
            proxyManager = new ProxyManager();
            proxyManager.command(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
