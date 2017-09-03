import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) {
        App app = new App();

        try {
            Class<?> c = app.getClass();
            Method m = c.getMethod("method");
            MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.description());
        }
        catch (NoSuchMethodException e) {
            System.out.println("Метод не знайдено");
        }
    }

    @MyAnnotation(description = "Опис методу")
    public static void method() {

    }

}
