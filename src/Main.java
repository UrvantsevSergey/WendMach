package src;
import src.model.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Lays");
        product1.setPrice(90);

        System.out.println(product1.getName());
    }
}
