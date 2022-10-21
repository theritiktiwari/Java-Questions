import java.util.*;

public class code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String str = sc.nextLine();
        int len = str.length();
        int count[] = new int[256];
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        char ch[] = new char[len];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println("Number of Occurrence of " + str.charAt(i) + " is : " + count[str.charAt(i)]);
        }
        sc.close();
    }
}