import java.util.*;

public class code8 {
    public static void Menu() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1. Factorial of a number.");
        System.out.println("2. Reverse of a number.");
        System.out.println("3. Palindrome of a number.");
        System.out.println("4. Fibonacci Series (upto nth term).");
        System.out.println("5. Permutation & Combination.");
        System.out.println("6. KVP Number.");
        System.out.println("7. Decimal to Binary Conversion.");
        System.out.println("8. Decimal to Octal Conversion.");
        System.out.println("9. Decimal to Hexa Conversion.");
        System.out.println("10. Exit.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static int factorial(int num) {
        if (num <= 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }

    public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static int KVP(int num){
        int fact = 0;
        while (num > 0){
            fact += factorial(num % 10);
            num /= 10;
        }
        return fact;
    }

    public static String strRev(String str){
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }

    public static String Conversion(int num, int base){
        String s = "";
        char bin[] = {'0', '1'};
        char octal[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8'};
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        while(num > 0){
            int rem = num % base;
            if(base == 2){
                s = bin[rem] + s;
            }
            else if(base == 8){
                s = octal[rem] + s;
            }
            else if(base == 16){
                s = hex[rem] + s;
            }
            num /= base;
        }
        return s;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            Menu();
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number : ");
                    int num1 = sc.nextInt();
                    System.out.println("Factorial of " + num1 + " is " + factorial(num1));
                    break;
                case 2:
                    System.out.print("Enter a number : ");
                    int num2 = sc.nextInt();
                    System.out.println("Reverse of " + num2 + " is " + reverse(num2));
                    break;
                case 3:
                    System.out.print("Enter a number : ");
                    int num3 = sc.nextInt();
                    if (num3 == reverse(num3)) {
                        System.out.println(num3 + " is a palindrome.");
                    } else {
                        System.out.println(num3 + " is not a palindrome.");
                    }
                    break;
                case 4:
                    System.out.print("Enter a number : ");
                    int num4 = sc.nextInt();
                    System.out.println("Fibonacci Series upto " + num4 + "th term is : ");
                    for (int i = 0; i < num4; i++) {
                        System.out.print(fibonacci(i) + " ");
                    }
                    System.out.print("\n");
                    break;
                case 5:
                    System.out.print("Enter a number1 (n) : ");
                    int num5 = sc.nextInt();
                    System.out.print("Enter a number2 (r) : ");
                    int num6 = sc.nextInt();
                    System.out.println("Permutation of " + num5 + "P" + num6 + " is " + (factorial(num5) / factorial(num6)));
                    System.out.println("Combination of " + num5 + "C" + num6 + " is " + (factorial(num5) / (factorial(num6) * factorial(num5 - num6))));
                    break;
                case 6:
                    System.out.print("Enter a number : ");
                    int num7 = sc.nextInt();
                    if(num7 == KVP(num7)){
                        System.out.println(num7 + " is a KVP number.");
                    }
                    else{
                        System.out.println(num7 + " is not a KVP number.");
                    }
                    break;
                case 7:
                    System.out.print("Enter a number : ");
                    int num8 = sc.nextInt();
                    System.out.println("Binary of " + num8 + " is " + Conversion(num8, 2));
                    break;
                case 8:
                    System.out.print("Enter a number : ");
                    int num9 = sc.nextInt();
                    System.out.println("Octal of " + num9 + " is " + Conversion(num9, 8));
                    break;
                case 9:
                    System.out.print("Enter a number : ");
                    int num10 = sc.nextInt();
                    System.out.println("Hexadecimal of " + num10 + " is " + Conversion(num10, 16));
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
            }
        } while (choice != 10);
        sc.close();
    }
}