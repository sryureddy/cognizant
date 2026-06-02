import java.util.*;

public class j27 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Mango");
        list.add("Apple");
        list.add("Banana");

        Collections.sort(list, (a, b) -> a.compareTo(b));

        System.out.println(list);
    }
}