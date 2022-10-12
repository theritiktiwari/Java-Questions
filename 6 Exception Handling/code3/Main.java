import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        try{
            System.out.print("Enter a: ");
            a = sc.nextInt();
            System.out.print("Enter b: ");
            b = sc.nextInt();
            System.out.println("a/b = " + a/b);
        } catch (ArithmeticException e) {
            System.out.println("Dividing by zero is not permitted");
        } catch (InputMismatchException e) {
            System.out.println("Input string contains non-numeric data");
        } catch (NullPointerException e) {
            System.out.println("Manipulation of null value is not correct");
        }
    }
}