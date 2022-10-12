import java.util.*;
public class PaintCostFinder{
    int gallon = 300;
    int rate = 30;
    int cost(int area){
        int num = (int)Math.ceil(area / gallon);
        System.out.println("The number of gallons of paint needed is " + num);
        return num * rate;
    }

    int area(int length, int breadth, int height){
        int area = length * breadth * height;
        return cost(area);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        PaintCostFinder pcf = new PaintCostFinder();
        System.out.print("Enter the length of the room : ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of the room : ");
        int breadth = sc.nextInt();
        System.out.print("Enter the height of the room : ");
        int height = sc.nextInt();
        int price = pcf.area(length, breadth, height);
        System.out.println("The total cost of paint is $" + price);
    }
}