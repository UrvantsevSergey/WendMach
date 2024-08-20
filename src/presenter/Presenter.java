package src.presenter;
import src.view.View;


public class Presenter {
    private View mView;
    private Service mService;

    public Presenter(View view) {
        mView = view;
        mService = new Service();
    }

    public void addBottle(String name, double price, double volume) {
        mService.addBottle(name, price, volume);
    }
    public void addSneck(String name, double price, double weight) {
        mService.addSneck(name, price, weight);
    }
    public void showProducts() {
        mService.showProducts();
    }
}
