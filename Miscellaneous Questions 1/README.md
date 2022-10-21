# Miscellaneous Questions 1

**Ques 1 :** Write a simple java program to iterate through an integer array comprising of 10 elements and find the position of the greatest element in the array. The output should print the greatest element and its position. Note: Take the input array such that the greatest element should not be in the 1st or last position of the array.

**Code :**

```java
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
        for(int i = 0; i < 9; i++){
            if(max < arr[i]){
                max = arr[i];
                position = i + 1;
            }
        }
        System.out.println("The largest element is " + max);
        System.out.println("The position of the largest element is " + position);
        sc.close();
    }
}
```

**Ques 2 :** Assume that an input array comprises of both even and odd numbers as its elements, write a simple java program to remove all the even elements alone from the array and then print the array comprising of odd numbers alone.

**Code :**

```java
public class code2 {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        System.out.print("Original array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                for(int j = i; j < arr.length - 1; j++){
                    arr[j] = arr[j + 1];
                }
            }
        }
        System.out.print("After removing even elements : ");
        for(int i = 0; i < arr.length - count; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
```

**Ques 3 :** Assume that an input array comprises of 10 numbers. Write a java program to find the difference between the largest and smallest element in the array and print the difference value.

**Code :**

```java
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
        for(int i = 0; i < 9; i++){
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }
        System.out.println("Difference between largest and smallest elements : " + max + " - " + min + " = " + (max - min));
        sc.close();
    }
}
```

**Ques 4 :** Write a Java program to cyclically rotate a given array clockwise by one.

**Code :**

```java
import java.util.*;
public class code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Original array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        System.out.print("Array after rotation : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
```

**Ques 5 :** Write a simple java program to count the number of vowels and consonants in your name and print their respective count.

**Code :**

```java
import java.util.*;
public class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String str = sc.nextLine();
        int vowel = 0, consonant = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
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
```

**Ques 6 :** Write a simple java program to read your name and print the count of repetition of each letter in your name.

**Code :**

```java
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
```

**Ques 7 :** Write a Java program to divide a string into 'n' equal parts

**Code :**

```java
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
```

**Ques 8 :** Create a class named AccountDetails. The AccountDetails class should have the facility to maintain the following information: Account holder name, age, date of birth, identity (Aadhar/PAN), account balance, account type etc. There a two major actions performed over the account namely Deposit and Withdrawal. When a deposit is made, the user should be prompted to enter the deposit amount and the same should be added to the account balance and update the balance. When a withdrawal is done, the user should be prompted to enter the withdrawal amount and a condition to check if the withdrawal amount is less than available balance is to be carried out. If less, subtract the withdrawal amount from the available balance and update the balance. Perform the Deposit and withdrawal operations using member methods and demonstrate the working of the class.

**Code :**

```java
import java.util.*;
public class code8{
    String Name, accountType;
    int age, identity, balance;

    public void withdraw(int amount){
        if(balance < amount)
            System.out.println("Insufficient Balance");
        else{
            balance -= amount;
            System.out.println(amount + " Withdrawaled");
        }
        System.out.println("Balance: " + balance);
    }
    public void deposit(int amount){
        balance = balance + amount;
        System.out.println(amount + " Desposited");
        System.out.println("Balance: " + balance);
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        Name = sc.nextLine();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        System.out.print("Enter Identity (Aadhar/PAN) : ");
        identity = sc.nextInt();
        System.out.print("Enter Account Type : ");
        accountType = sc.next();
        System.out.print("Enter Balance : ");
        balance = sc.nextInt();
    }

    public void display(){
        System.out.println("Name : " + Name);
        System.out.println("Age : " + age);
        System.out.println("Identity : " + identity);
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance : " + balance);
    }

    public static void main(String args[]){
        code8 c = new code8();
        c.input();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter amount to withdraw : ");
                    int amount1 = sc.nextInt();
                    c.withdraw(amount1);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit : ");
                    int amount2 = sc.nextInt();
                    c.deposit(amount2);
                    break;
                case 3:
                    c.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);
        sc.close();
    }
}
```
