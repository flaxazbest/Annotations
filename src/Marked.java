import java.lang.reflect.Method;

public class Marked {

    @Marker
    public static void foo() {
        Marked mark = new Marked();
        try {
            Method m = mark.getClass().getMethod("foo");
            if (m.isAnnotationPresent(Marker.class))
                System.out.println("Маркований метод");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        foo();
    }

}
