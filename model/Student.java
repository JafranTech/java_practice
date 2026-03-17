 abstract class a{
    public void show(){
        System.out.println("heyy dude i am abstract from class a!!");
    }
}
class b extends a{
    @Override
    public void show() {
        System.out.println("i am extended oneeee");
    }
}

public class Student {

    public static void main(String[] args) {
        a aa= new b();
        aa.show();
    }
}