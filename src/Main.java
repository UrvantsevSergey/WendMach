package src;
import src.model.*;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Lays", 90);
        Product product2 = new Bottle("Coca-cola", 120, 2);
        Product product3 = new Product("Twix", 100);
        WendingMachine machine = new WendingMachine();
        machine.addProduct(product1);
        machine.addProduct(product2);
        machine.addProduct(product3);
        System.out.println(machine);
    }
}
