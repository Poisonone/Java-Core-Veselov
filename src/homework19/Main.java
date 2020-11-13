package homework19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Methods obj = new Methods();
        obj.serialize();
        obj.deserialize();
        obj.serializeList();
        obj.deserializeList();
    }
}
