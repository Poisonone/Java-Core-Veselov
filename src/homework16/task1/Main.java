package homework16.task1;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        Class<Animal> animalClass = Animal.class;
        System.out.println(animalClass.getName());
        System.out.println(animalClass.getSimpleName());
        // модифікатори
        int mods = animalClass.getModifiers();
        System.out.println(mods);
        System.out.println();
        System.out.println(Modifier.isPublic(mods));
        System.out.println(Modifier.isStatic(mods));
        System.out.println(Modifier.isPrivate(mods));
        System.out.println(Modifier.isAbstract(Animal.class.getModifiers()));
        // пакети
        Package aPackage = animalClass.getPackage();
        System.out.println(aPackage);
        // конструктори
        Constructor<?>[] constructors = animalClass.getConstructors();
        for (Constructor cons : constructors) {
            System.out.println(cons);
        }
        Constructor<?> constructor = constructors[0];
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        for (Class param : parameterTypes) {
            System.out.println(param);
        }
        // поля
        Field[] fields = animalClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Field[] declaredFields = animalClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
    }
}
