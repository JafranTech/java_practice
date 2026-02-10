class H extends Thread{
    public void run(){
        System.out.println("hii");
    }
}

public class dmeo1 {
    public static void main(String[] args) {
        H h = new H();
        h.run();
        try{
            h.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("hii");
    }
}
