import java.util.*;

public class code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name : ");
        String lastName = sc.nextLine();
        System.out.println("Welcome! " + firstName + " " + lastName);
        sc.close();
    }
}