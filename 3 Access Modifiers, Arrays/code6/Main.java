class First{
    public int data = 40;
    public void msg(){
        System.out.println("Hello java");
    }
}

public class Main{
    public static void main(String args[]){
        First obj = new First();
        System.out.println(obj.data);
        obj.msg();
    }
}
