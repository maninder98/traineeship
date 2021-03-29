package h10;

public class Android extends Human implements Chargeable {

    private int level;

    public String greet() {
        return "I'm only half human, but humanstill.... My energy level is " + level + "%.";
    }

    public int charge(int amount) {
        if (level + amount > 100) return level;

        level += amount;
        return level;
    }
}
