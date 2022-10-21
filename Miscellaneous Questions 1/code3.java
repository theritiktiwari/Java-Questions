import java.util.*;

public class code3 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < 9; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println(
                "Difference between largest and smallest elements : " + max + " - " + min + " = " + (max - min));
        sc.close();
    }
}