package src.presenter;

public interface ServiceInterface {
    void showProducts();
    void addBottle(String name, double price, double volume);
    void addSneck(String name, double price, double weight);
    void sortByPrice();
    void save();
    void load();


}
