package homework16.task3;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    static Reflect reflect;

    public ReflectionTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        getClassFields(reflect.getClass());
        getClassMethods(reflect.getClass());

        Class<?> cls = reflect.getClass();

        System.out.println("\n1. invoke method toString()\n");

        Method method = cls.getMethod("toString");
        System.out.println(method.invoke(reflect));

        Class<?>[] paramTypes;
        Object[] args;

        paramTypes = new Class[]{int.class, String.class};
        method = cls.getMethod("setData", paramTypes);

        args = new Object[]{(int) 123, new String("New value")};
        method.invoke(reflect, args);

        System.out.println("\n2. invoke method toString()\n");
        method = cls.getMethod("toString");
        System.out.println(method.invoke(reflect));

    }

    private void getClassFields(Class<?> cls) {
        Field[] fields = cls.getDeclaredFields();
        System.out.println("Class fields");
        for (Field field : fields) {
            Class<?> fld = field.getType();
            System.out.println("Class name : " + field.getName());
            System.out.println("Class type : " + fld.getName());
        }
    }

    private void getClassMethods(Class<?> cls) {
        Method[] methods = cls.getDeclaredMethods();
        System.out.println("Class methods");
        for (Method method : methods) {
            System.out.println("Method name : " + method.getName());
            System.out.println("Return type : " +
                    method.getReturnType().getName());
            Class<?>[] params = method.getParameterTypes();
            System.out.print("Parameters : ");
            for (Class<?> param : params)
                System.out.print(" " + param.getName());
            System.out.println();
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        reflect = new Reflect();
        new ReflectionTest();
        System.exit(0);
    }
}