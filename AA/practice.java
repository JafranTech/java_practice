import java.util.*;

class Student {
    int age;
    String name;

}

public class practice {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.age = 19;
        s1.name = "jafran";

        s2.age = 20;
        s2.name = "fazil";

        s3.age = 22;
        s3.name = "haafiz";

        Student st [] = new Student[3];
        st[0]=s1;
        st[1]=s2;
        st[2]=s3;

        for(int i = 0;i<st.length;i++){
            System.out.println(st[i].age+" "+st[i].name);
        }

    }
}
