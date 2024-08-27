package src.view;
import java.util.Scanner;
import src.presenter.Presenter;
import src.*;


public class ConsoleUI implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
    }


    public void start() {
        System.out.println("Добро пожаловать на склад магазина!\n\n Выберите нужный пункт меню.\n\n");
        while (work) {
            System.out.println("1. Добавить бутылку.");
            System.out.println("2. Добавить снэк.");
            System.out.println("3. Показать список товаров.");
            System.out.println("4. Отсортировать по цене.");
            System.out.println("5. Сохранить.");
            System.out.println("6. Загрузить.");
            System.out.println("7. Закончить работу.\n\n");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addBottle();
                    break;
                case "2":
                    addSnack();
                    break;
                case "3":
                    presenter.showProducts();
                    break;
                case "4":
                    presenter.sortByPrice();
                    presenter.showProducts();
                    break;
                case "5":
                    presenter.save();
                    break;
                case "6":
                    presenter.load();
                    break;
                case "7":
                    work = false;
                    System.out.println("Работа с приложением склад закончена!");
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте снова.");
                    break;
            }
        }
    }
    public void addBottle() {
        System.out.println("Введите название бутылки:");
        String name = scanner.nextLine();
        System.out.println("Введите цену бутылки:");
        double price = scanner.nextDouble();
        System.out.println("Введите объем бутылки:");
        double volume = scanner.nextDouble();
        presenter.addBottle(name, price, volume);
        printAnswer("Бутылка добавлена.\n\n");
        scanner.nextLine(); // очистка ввода после ввода объема бутылки
    }
    public void addSnack() {
        System.out.println("Введите название снэка:");
        String name = scanner.nextLine();
        System.out.println("Введите цену снэка:");
        double price = scanner.nextDouble();
        System.out.println("Введите вес снэка:");
        double weight = scanner.nextDouble();
        presenter.addSneck(name, price, weight);
        printAnswer("Снэк добавлен.\n\n");
        scanner.nextLine();
    }
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}
