import java.util.*;

class FurnitureShop{
    Scanner sc = new Scanner(System.in);
    String name, address, phone, furnitureName;
    int distanceFromShop, furniture;
    void getCustomerDetails(){
        System.out.print("Enter customer name : ");
        name = sc.next();
        System.out.print("Enter customer address : ");
        address = sc.next();
        System.out.print("Enter customer phone : ");
        phone = sc.next();
        System.out.print("Enter distance from shop : ");
        distanceFromShop = sc.nextInt();
    }
    void getFurnitures(){
        System.out.println("1. Chairs");
        System.out.println("2. Tables");
        System.out.println("3. Sofa");
        System.out.print("Enter your choice : ");
        furniture = sc.nextInt();
        furnitureName = (furniture == 1) ? "Chairs" : (furniture == 2) ? "Tables" : (furniture == 3) ? "Sofa" : "No Furniture Selected";
    }
}

class CustomizeFurniture extends FurnitureShop{
    int customize;
    String customizationName;
    void doCustomization(){
        System.out.println("1. Extra Cushion");
        System.out.println("2. Fine Polishing");
        System.out.println("3. Nil");
        System.out.print("Enter your choice : ");
        customize = sc.nextInt();
        customizationName = (customize == 1) ? "Extra Cushion" : (customize == 2) ? "Fine Polishing" : "No Customization";
    }
}

class Transport extends CustomizeFurniture{
    int charges = 0;
    void transportCharges(){
        if(distanceFromShop > 5)
            charges = 500;
    }
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Furniture Name : " + furnitureName);
        System.out.println("Customization Name : " + customizationName);
        if(charges != 0) 
            System.out.println("Transportation Charges : " + charges);
        else
            System.out.println("No Transportation Charges");
    }
}

public class Main{
    public static void main(String args[]){
        Transport t = new Transport();
        t.getCustomerDetails();
        t.getFurnitures();
        t.doCustomization();
        t.transportCharges();
        t.display();
    }
}