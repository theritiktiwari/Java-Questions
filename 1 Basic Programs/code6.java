import java.util.*;

public class code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();
        System.out.print("Enter a double : ");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        System.out.println("Int : " + num);
        System.out.println("Decimal : " + d);
        System.out.println("String : " + str);
        sc.close();
    }
}