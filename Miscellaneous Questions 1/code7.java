import java.util.*;

public class code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String str = sc.nextLine();
        System.out.print("Enter the number of parts : ");
        int n = sc.nextInt();
        int len = str.length();
        int part = len / n;
        int rem = len % n;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (rem > 0) {
                System.out.println(str.substring(i, i + part + 1));
                i = i + part + 1;
                rem--;
            } else {
                System.out.println(str.substring(i, i + part));
                i = i + part;
            }
        }
        sc.close();
    }
}