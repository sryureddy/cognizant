import java.util.*;

record Person(String name, int age) {}

public class j29 {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Ram", 20),
                new Person("Ravi", 17)
        );

        list.stream()
            .filter(p -> p.age() >= 18)
            .forEach(System.out::println);
    }
}