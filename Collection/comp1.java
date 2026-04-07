package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.Scanner.*;

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
    }
    
}

public class comp1 {

 public static void main(String[] args) {
    Comparator <Student> ref = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            

            // return o1.name.compareToIgnoreCase(o2.name);

            return Integer.compare(o1.age, o2.age);
             
            
        };
    };
   


    


   
        List<Student>obj=new ArrayList<>();

        obj.add(new Student(20,"Jafran"));
        obj.add(new Student(10,"alex"));
        obj.add(new Student(33,"bobby"));
        obj.add(new Student(90,"arco"));

        
        Collections.sort(obj,ref);
        for(Student s:obj){
            System.out.println(s);
        }
    }
}

//using comparable according to our logic