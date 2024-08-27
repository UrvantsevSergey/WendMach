package src.model;
import java.util.Iterator;
import java.util.List;

public class ProductIterator<Product> implements Iterator<Product> {
    private int idx;
    private List<Product> products;

    public ProductIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return idx < products.size();
    }

    @Override
    public Product next() {
        return products.get(idx++);
    }
}
