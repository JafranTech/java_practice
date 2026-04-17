class sum {
    int count = 0;
    public void k(){
        count++;
    }
}



public class t1 {

    public static void main(String[] args) {

        sum s = new sum();

        Runnable r = () ->{
            for(int i =1;i<=1000;i++){
                s.k();
            }
        };

        Runnable r1 = () ->{
            for(int i =1;i<=1000;i++){
                s.k();
            }
        };


       

        Thread t = new Thread(r);
        Thread t2 = new Thread(r1);

        t.start();
        
        t2.start();
        
        try {
             t.join();
        t2.join();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
       
        if (s.count>=1999) {
            System.out.println(s.count);
        }
        
    }
}