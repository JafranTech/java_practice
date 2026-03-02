class Innerbasic3 {
    private int age;
    private String name;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

}

public class basic3 {

    public static void main(String[] args) {

        Innerbasic3 bs = new Innerbasic3();
        bs.setAge(18);
        bs.setName("jafran");
        System.out.println(bs.getAge()+":"+bs.getName());

    }
}