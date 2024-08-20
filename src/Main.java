package src;
import src.model.*;
import src.view.*;
import src.presenter.*;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
    }
}
