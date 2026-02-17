package pumo;

public class valueof {
    public static void main(String[] args) {
        //mainly used for integer to string


        int a = 10;
        System.out.println(a);
        System.out.println(a.getClass().getSimpleName());

        //till above show error because primitive data types are not class based object

        // now i change the int to string using valueof()

        //valueOf in this Of - O is caps.!!!!

        String s = String.valueOf(a);

        // now error is fixed i change primitve to non primitve

        System.out.println(s.getClass().getSimpleName());


    }
}
