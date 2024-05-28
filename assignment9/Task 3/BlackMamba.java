public class BlackMamba extends Snake implements Poisonous, Moveable {
    public BlackMamba(double length, double mass, String name) {
        super(length, mass, name);
    }

    @Override
    public void bite() {
        System.out.println(getName() + " bites!");
    }

    @Override
    public void start() {
        System.out.println(getName() + " starts!");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " stopped!");
    }

    @Override
    public String getName() {
        return name;
    }
}