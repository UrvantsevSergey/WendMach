package src.model;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Product(){
    }

    @Override
    public String toString() {
        return "name: " + name + ", price: " + price + "p.";
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
