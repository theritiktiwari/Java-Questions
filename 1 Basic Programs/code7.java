import java.util.*;

public class code7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();

        System.out.print("10 multiples of " + num + " is : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(num * i + " ");
        }
        System.out.print("\n");
        scanner.close();
    }
}