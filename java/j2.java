import java.util.*;
public class j2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        double a=sc.nextDouble();
        System.out.println("Enter the 2nd number");
        double b = sc.nextDouble();
        System.out.println("Enter the operation(+,-,*,%,/)");
        char op=sc.next().charAt(0);
        double result;
        switch(op){
            case '+':
                result=a+b;
                System.out.println(result);
                break;
            case '-':
                result=a-b;
                System.out.println(result);
                break;
            case '*':
                result=a*b;
                System.out.println(result);
                break;
            case '%':
                result=a%b;
                System.out.println(result);
                break;
            case '/':
                result=a/b;
                System.out.println(result);
                break;
            default :
            System.out.println("invalid option");
        }
        sc.close();
    }
}