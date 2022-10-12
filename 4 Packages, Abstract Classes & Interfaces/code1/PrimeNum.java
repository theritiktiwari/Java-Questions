package primepackage;
import java.util.*;

public class PrimeNum {
    public boolean checkForPrime(int num){
        if (num == 1)
            return false;
        int i, flag = 0;
        for(i = 2; i < num; i++){
            if(num % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            return true;
        else
            return false;
    }
}