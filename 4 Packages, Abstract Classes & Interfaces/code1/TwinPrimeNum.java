package TwinPrimeNum;
import primepackage.*;
import java.util.*;

public class TwinPrimeNum {
    public static void main(String args[]){
        PrimeNum p = new PrimeNum();
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter 1st number : ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        num2 = sc.nextInt();

        for(int i = num1; i <= num2; i++){
            if(p.checkForPrime(i) && p.checkForPrime(i+2))
                System.out.println(i + " " + (i+2));
        }
    }
}