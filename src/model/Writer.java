package src.model;
import java.io.*;


public class Writer implements SaveLoad {
    private WendingMachine machine;

    public Writer(WendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void save(String filename) throws IOException {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(machine);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void load (String filename){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            machine = (WendingMachine) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Список товаров загружен.");
    }
}
