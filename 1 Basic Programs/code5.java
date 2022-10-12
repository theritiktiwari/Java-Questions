import java.util.*;
public class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            if (num >= 2 && num <= 10) {
                System.out.println("You are an even in the range 2-10");
            } else if (num >= 10 && num <= 20) {
                System.out.println("You are an even in the range 10-20");
            } else {
                System.out.println("You are an even who is greater than 20");
            }
        } else {
            System.out.println("You are odd");
        }
    }
}