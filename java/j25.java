import java.util.HashMap;
import java.util.Scanner;

public class j25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Ram");
        map.put(102, "Sita");
        map.put(103, "Ravi");

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.println("Name: " + map.get(id));

        sc.close();
    }
}