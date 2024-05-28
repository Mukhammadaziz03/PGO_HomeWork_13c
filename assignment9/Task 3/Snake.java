public abstract class Snake {
    protected final double length;
    protected final String name;
    protected final double mass;

    public Snake(double length, double mass, String name) {
        this.length = length;
        this.mass = mass;
        this.name = name;
    }

    public abstract String getName();
}