import java.util.*;

public class code3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long binary1, binary2;
        int i = 0, carry = 0;
        int[] sum = new int[10];
        System.out.print("Enter first binary number: ");
        binary1 = scanner.nextLong();
        System.out.print("Enter second binary number: ");
        binary2 = scanner.nextLong();
        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + carry) % 2);
            carry = (int) ((binary1 % 10 + binary2 % 10 + carry) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (carry != 0)
            sum[i++] = carry;
        --i;
        System.out.print("Output: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
        scanner.close();
    }
}