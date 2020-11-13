package homework19;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Methods obj = new Methods();
        obj.serialize();
        obj.deserialize();
        obj.serializeList();
        obj.deserializeList();
    }
}
