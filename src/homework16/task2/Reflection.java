package homework16.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) {
        String name = null;
        Human human = new Human();
        try {
            Field field = human.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(human, (String) "Oleg");
            name = (String) field.get(human);
            Method method = human.getClass().getDeclaredMethod("print");
            method.setAccessible(true);
            method.invoke(human);
        } catch (NoSuchFieldException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {

        }
        human.print();
    }
}
