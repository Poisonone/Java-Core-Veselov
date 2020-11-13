package homework19;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Methods {

    Employee employee = new Employee(25000, 1, "Andriy", "Belyi");
    List<Object> list = new ArrayList<>(Arrays.asList(employee));
    String path = "C:\\Test\\Saved.txt";
    String pathList = "C:\\Test\\Saved1.txt";

    public void serialize() throws IOException {
        FileOutputStream outputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
    }

    public void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee employee = (Employee) objectInputStream.readObject();
        System.out.println(employee);
    }

    public void serializeList() throws IOException {
        FileOutputStream outputStream = new FileOutputStream(pathList);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
    }

    public void deserializeList() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(pathList);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object list = objectInputStream.readObject();
        System.out.println(list);
    }

}
