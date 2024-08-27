package src.model;
import java.io.IOException;

public interface SaveLoad {
    void save(String filename)throws IOException;
    void load(String filename) throws IOException, ClassNotFoundException;
}
