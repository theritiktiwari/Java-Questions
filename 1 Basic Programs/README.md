# Basic Java Programs

**Ques 1 :** Write a Java Program to print hello world sting on the console.

**Code :**

```java
public class code1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

**Ques 2 :** Write a Java program to prompt the user to enter his / her first name and last name and then print a message 'Welcome' followed by the user's first and last name.

**Code :**

```java
import java.util.*;
public class code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name : ");
        String lastName = sc.nextLine();
        System.out.println("Welcome! " + firstName + " " + lastName);
        sc.close();
    }
}
```

**Ques 3 :** Write a Java program to prompt the user to enter two binary numbers and display the sum of those two binary numbers on console.

**Code :**

```java
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
        while (binary1 != 0 || binary2 != 0){
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + carry) % 2);
            carry = (int)((binary1 % 10 + binary2 % 10 + carry) / 2);
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
```

**Ques 4 :** Write a Java program to prompt the user to enter the area of a circle and display the radius and perimeter of the circle.

**Code :**

```java
import java.util.*;
public class code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area of the circle : ");
        double area = sc.nextDouble();
        double radius = Math.sqrt(area / Math.PI);
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Radius of the circle is : " + radius);
        System.out.println("Perimeter of the circle is : " + perimeter);
        sc.close();
    }
}
```

**Ques 5 :** Write a Java Program to read an integer and perform the following actions:

- If input number is odd, print You are odd
- If input number is even and in the inclusive range 2 of to 10 , print You are an even in the range 2-10
- If input number is even and in the inclusive range of 10 to 20, print You are an even in the range 10-20
- If is even and greater than 20, print You are an even who is greater than 20

**Code :**

```java
import java.util.*;
public class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            if (num >= 2 && num <= 10) {
                System.out.println("You are an even in the range 2-10");
            } else if (num >= 10 && num <= 20) {
                System.out.println("You are an even in the range 10-20");
            } else {
                System.out.println("You are an even who is greater than 20");
            }
        } else {
            System.out.println("You are odd");
        }
        sc.close();
    }
}
```

**Ques 6 :** Write a java program to read an integer, a double, and a String from stdin (System.in), then print the values.

**Code :**

```java
import java.util.*;
public class code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();
        System.out.print("Enter a double : ");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        System.out.println("Int : " + num);
        System.out.println("Decimal : " + d);
        System.out.println("String : " + str);
        sc.close();
    }
}
```

**Ques 7 :** Write a Java Program for reading an integer and printing first 10 multiples of the input integer.

**Code :**

```java
import java.util.*;
public class code7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();

        System.out.print("10 multiples of " + num + " is : ");
        for(int i = 1; i <= 10; i++){
            System.out.print(num * i + " ");
        }
        System.out.print("\n");
        scanner.close();
    }
}
```

**Ques 8 :** Construct a java program to create a Menu driven application that would perform the following tasks:

- Factorial of a number
- Reversal of a number
- To confirm a number is palindrome
- To confirm a number is a KVP number
- To perform Permutation and Combination
- Convert Decimal to Binary
- Convert Decimal to Octal
- Convert Decimal to Hexadecimal
- Fibonacci Series of n numbers
- Exit the application

**Code :**

```java
import java.util.*;

class code {
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
```
