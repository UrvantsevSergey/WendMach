package src.model;
import java.util.ArrayList;
import java.util.List;

public class WendingMachine {
    private List<Product> products;

    public WendingMachine() {
        products = new ArrayList<>();
    }

    public int size(){
        return products.size();
    }
    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список товаров: \n");
        for (Product product : products) {
            sb.append(product);
            sb.append("\n");
        }
        return sb.toString();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public Product getByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
