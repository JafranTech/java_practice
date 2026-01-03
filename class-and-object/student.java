import java.util.Scanner;

class student{

    
    String name = "";
    int age = 0;

    void details(){
        System.out.println("student name is:"+(name)+", age is :"+(age));
    }

    public static void main(String args []){

    Scanner sc = new Scanner(System.in);
    student s1 = new student();
    System.out.print("enter the name:");
    s1.name=sc.nextLine();
    System.out.print("enter the age:");
    s1.age=sc.nextInt();
    s1.details();

    System.out.println();

    sc.nextLine();
    student s2 = new student();
    System.out.print("enter the name:");
    s2.name=sc.nextLine();
    System.out.print("enter the age:");
    s2.age=sc.nextInt();
    s1.details();
}
}

