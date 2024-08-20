package src.model;

public class Sneck extends Product {
    private double weight;

    public Sneck(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }
    public Sneck() {
    }

    @Override
    public String toString() {
        return super.toString() + ", weight: " + weight + "g.";
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
