package src.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;

public class WendingMachine implements Serializable, Iterable<Product> {
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
    @Override
    public Iterator<Product> iterator() {
        return new ProductIterator(products); // Возвращаем итератор списка продуктов
    }
    public void sortByPrice() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Товары отсортированы по цене:");
    }

}
