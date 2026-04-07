import java.util.*;
class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
        // return "My name is :"+name+" "+"My age is :"+age+"\n";
    }

    
    
    
}

public class CompDemo {
    public static void main(String[] args) {
        List <Student> obj = new ArrayList<>();

        // Comparator <Student> ref = new Comparator<Student>() {
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         // if (o1.age>o2.age) {
        //         //     return 1;
        //         // }else{
        //         //     return -1;
        //         // }

        //         // return Integer.compare(o1.age, o2.age); //

        //         // return o1.name.compareTo(o2.name);


        //     }
        // };

        obj.add(new Student(20, "Jafran"));
        obj.add(new Student(21, "Fazil"));
        obj.add(new Student(19, "Jasam"));


        // System.out.println(obj);

        // obj.sort((o1,o2)->Integer.compare(o1.age, o2.age));  using Lambda function

        // obj.sort(Comparator.comparing(x->x.age)); best method 

        // System.out.println(obj);

        for(Student a :obj){
            System.out.println(a);
        }

    }
}
