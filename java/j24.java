import java.util.ArrayList;
import java.util.Scanner;

public class j24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("How many names? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}