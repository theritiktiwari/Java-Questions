import java.util.*;

public class MatrixAddition {
    public static void main(String args[]) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        m = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        n = sc.nextInt();
        
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];
        
        System.out.println("\nEnter elements of Matrix 1 - ");
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter elements of Matrix 2 - ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("b[" + i + "][" + j + "] = ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nResult of matrix addition is - ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                c[i][j] = b[i][j] + a[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
