import java.lang.reflect.Method;

public class j39 {
    public void display() {
        System.out.println("Reflection Example");
    }

    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("j39");

        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }

        Object obj = c.getDeclaredConstructor().newInstance();
        Method method = c.getDeclaredMethod("display");
        method.invoke(obj);
    }
}