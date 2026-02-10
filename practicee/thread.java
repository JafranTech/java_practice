class orderprocessing extends Thread{
    public void run(){
        int n = 50;
        
        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }

        for(int i =1;i<=n;i++){
            System.out.println("one");
        }
    }
}

class notificationservice extends Thread{
    public void run(){

        try{
            Thread.sleep(40);
        }
        catch(Exception e){
            System.out.println(e);
        }
        int n = 50;
        for(int i =1;i<=n;i++){
            System.out.println("two");
        }
    }
}

public class thread {
    public static void main(String[] args) {
        orderprocessing op = new orderprocessing();
        notificationservice ns = new notificationservice();
        
        op.start();
        ns.start();
    }
}
