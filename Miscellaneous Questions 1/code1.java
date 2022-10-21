import java.util.*;

public class code1 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int position = 0;
        for (int i = 0; i < 9; i++) {
            if (max < arr[i]) {
                max = arr[i];
                position = i + 1;
            }
        }
        System.out.println("The largest element is " + max);
        System.out.println("The position of the largest element is " + position);
        sc.close();
    }
}