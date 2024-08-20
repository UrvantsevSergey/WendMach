package src.model;

public class Bottle extends Product {
    private double volume;

    public Bottle(String name, double price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    public Bottle() {
    }

    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        return super.toString() + ", volume: " + volume + "л.";
    }
}
