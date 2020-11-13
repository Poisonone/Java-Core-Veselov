package homework19;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Methods {

    Employee employee = new Employee(25000, 1, "Andriy", "Belyi");
    List<Object> list = new ArrayList<>(Arrays.asList(employee));

    public void serialize() throws IOException {
        FileOutputStream outputStream = new FileOutputStream("C:\\Test\\Saved.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
    }

    public void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Test\\Saved.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee employee = (Employee) objectInputStream.readObject();
        System.out.println(employee);
    }

    public void serializeList() throws IOException {
        FileOutputStream outputStream = new FileOutputStream("C:\\Test\\Saved1.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
    }

    public void deserializeList() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Test\\Saved1.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object list = (Object) objectInputStream.readObject();
        System.out.println(list);
    }

}
