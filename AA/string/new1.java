package string;

public class new1 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("mohamed");

        sb.append(" jafran");
        String s = sb.toString();
        System.out.println(s.hashCode());
        s = s + " king";

        System.out.println(s.hashCode());
        System.out.println(s.hashCode());
        System.out.println(s);

    }
}