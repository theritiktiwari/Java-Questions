import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Registation Number: ");
        String reg_no = sc.nextLine();
        System.out.print("Enter the Mobile Number: ");
        String mob_no = sc.nextLine();
        int err = 0;

        try{
            if (mob_no.length() != 10) {
                throw new IllegalArgumentException("Mobile number does contain 10 digits");
            }
        } catch (IllegalArgumentException e) {
            err = 1;
            System.out.println(e.getMessage());
        }

        try{
            if (reg_no.length() != 9) {
                throw new IllegalArgumentException("Registration number does not contain 9 characters");
            }
        } catch (IllegalArgumentException e) {
            err = 1;
            System.out.println(e.getMessage());
        }

        try{
            for (int i = 0; i < mob_no.length(); i++) 
                if (!Character.isDigit(mob_no.charAt(i))) 
                    throw new NumberFormatException("Mobile number contains non-digit characters");
        } catch (NumberFormatException e) {
            err = 1;
            System.out.println(e.getMessage());
        }

        try{
            for (int i = 0; i < reg_no.length(); i++)
                if (!Character.isDigit(reg_no.charAt(i)) && !Character.isAlphabetic(reg_no.charAt(i)))
                    throw new NoSuchElementException("Registration number contains non-digit and non-alphabetic characters");
        } catch (NoSuchElementException e) {
            err = 1;
            System.out.println(e.getMessage());
        }

        if(err == 0)
            System.out.println("Valid");
    }
}