package model;

public class TestSamePackage {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.marks);     // try
        System.out.println(s.name);      // try
        System.out.println(s.college);   // try

        s.showDefault();     // try
        s.showProtected();   // try
        s.showPublic();      // try

        // s.showPrivate(); ❌
        // System.out.println(s.age); ❌
    }
}