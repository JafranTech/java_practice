public class string2 {
    public static void main(String args[]){
        /*instead doing a1==a2 we enter a1.equalsto(a2)-->> this is the correct method to put . 
         In Java, == compares references, while equals() 
         compares String content. 
         Hence, equals() is the correct way to 
         compare Strings.*/

        String a1 = new String ("apple");
        String a2 = new String ("apple");

        String f1 = "apple";
        String f2 = "apple";

        System.out.print(a1==a2);
        System.out.print(f1==f2);
    }
}
