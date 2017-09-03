import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MyAnnotation(description = "Анотація класу")
@Anno(descr = "App2", val = 500)
public class App2 {

    @MyAnnotation(description = "Анотація методу")
    @Anno(descr = "Tecn", val = 400)
    public static void foo() {

        App2 app = new App2();

        try {
            Annotation ann[] = app.getClass().getAnnotations();
            System.out.println("Всі анотації класу:");
            for (Annotation a: ann) {
                System.out.println(a);
            }

            System.out.println();

            Method m = app.getClass().getMethod("foo");
            ann = m.getAnnotations();
            System.out.println("Всі анотації методу:");
            for (Annotation a: ann) {
                System.out.println(a);
            }
        }
        catch (NoSuchMethodException e) {
            System.err.println(e);
        }

    }

    public static void main(String[] args) {
        foo();
    }

}
