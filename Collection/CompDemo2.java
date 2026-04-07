import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age,o.age
        );
    }

    
} 
public class CompDemo2 {
    public static void main(String[] args) {
         List <Student> obj = new ArrayList<>();

         obj.add(new Student(20, "Jafran"));
        obj.add(new Student(21, "Fazil"));
        obj.add(new Student(19, "Jasam"));

        Collections.sort(obj);

       for(Student a :obj){
            System.out.println(a);
        }

    }
    
}