class Produce_Consume{
    int i;
    boolean flag = false;
    synchronized void Produce(int i){
        if(flag)
            try{
                wait();
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        this.i = i;
        System.out.println("Data Delivered: " +i);
        flag = true;
        notify();
    }
    synchronized int Consume(){
        if(!flag)
            try{
                wait();
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        System.out.println("Data Received: " + i);
        flag = false;
        notify();
        return i;
    }
}

class ProduceThread extends Thread{
    Produce_Consume obj;
    ProduceThread(Produce_Consume obj){
        this.obj = obj;
    }
    public void run(){
        for(int k = 0; k <= 5; k++)
        obj.Produce(k);
    }
}

class ConsumeThread extends Thread{
    Produce_Consume obj;
    ConsumeThread(Produce_Consume obj){
        this.obj = obj;
    }
    public void run(){
        for(int k = 0; k <= 5; k++)
        obj.Consume();
    }
}

class Main{
    public static void main(String[] args){
        Produce_Consume obj = new Produce_Consume();
        ProduceThread P = new ProduceThread(obj);
        P.start();
        ConsumeThread C = new ConsumeThread(obj);
        C.start();
    }
}