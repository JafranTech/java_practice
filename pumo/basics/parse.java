package pumo;

public class parse {
    public static void main(String[] args) {
        String s= "121";
        
        //ParseInt() used for string to integer
        //String.valueof

        System.out.println(s.getClass());
        int num = Integer.parseInt(s);

        String b ="33";
        System.out.println(b.getClass().getSimpleName());

        // in output we need not this kind of op class java.lang.String
        // we have to add b.getClass.getSimpleName() use for knowing the class name of the object.

        
    }
}
