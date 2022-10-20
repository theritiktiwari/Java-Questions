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