package pumo;

public class length {
    public static void main(String[] args) {
        long a=1234567899;
        System.out.println(a);

        

        //string to int or what kind of primitive data type.
        // for above - integer.parseintr()
        // int to string - string.valueof()

        String ew = String.valueOf(a);

        int b = ew.length();
        System.out.println(b);

    }
}
