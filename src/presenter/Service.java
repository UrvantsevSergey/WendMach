package src.presenter;
import src.model.*;

public class Service implements ServiceInterface {
    private WendingMachine machine;
    private Bottle bottle;
    private Sneck snack;

    public Service() {
        this.machine = new WendingMachine(); // Инициализация объекта
    }

    public void addBottle(String name, double price, double volume) {
    Bottle bottle = new Bottle(name, price, volume);
    machine.addProduct(bottle);
    }
    public void addSneck(String name, double price, double weight) {
    Sneck snack = new Sneck(name, price, weight);
    machine.addProduct(snack);
    }
    public void showProducts() {
        String answer = machine.toString();
        System.out.println(answer);
    }
}
