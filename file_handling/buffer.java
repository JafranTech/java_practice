package file_handling;
import java.io.FileWriter;

public class buffer {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("main.txt", true);
            fw.write("hello i am jafran");
            
            fw.append("how are you");
            fw.close();
            

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
