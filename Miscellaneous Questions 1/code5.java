import java.util.*;

public class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String str = sc.nextLine();
        int vowel = 0, consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')
                vowel++;
            else
                consonant++;
        }
        System.out.println("Name : " + str);
        System.out.println("Vowel : " + vowel);
        System.out.println("Consonant : " + consonant);
        sc.close();
    }
}