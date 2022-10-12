import java.util.*;

public class MatrixMultiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        
        System.out.println("\nEnter elements of Matrix 1 - ");
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter elements of Matrix 2 - ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("b[" + i + "][" + j + "] = ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nResult of matrix addition is - ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j]; 
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
