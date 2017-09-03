import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) {
        method2("Тест", 300);
    }

    @MyAnnotation(description = "Опис методу")
    public static void method() {

    }

    @Anno(descr = "Два параметра", val = 4)
    public static void method2(String s, int i) {
        App app = new App();
        try {
            Class<?> c = app.getClass();
            Method m = c.getMethod("method2", String.class, int.class);
            Anno anno = m.getAnnotation(Anno.class);
            System.out.println(anno.descr() + " " + anno.val());
        }
        catch (NoSuchMethodException e) {
            System.err.println(e);
        }
    }

}
