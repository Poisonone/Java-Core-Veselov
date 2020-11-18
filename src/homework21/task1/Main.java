package homework21.task1;

import java.lang.annotation.Annotation;


public class Main {
    @MyAnnotation
    public static int field;

    // Пізніше ше розберусь з тими аннотаціями)
    public static void main(String[] args) {
        Class<Main> test = Main.class;
        Annotation[] annotations = test.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}


