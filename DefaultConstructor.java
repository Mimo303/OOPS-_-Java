//Default Constructor 

//package Constructors;

class Student{
    int roll;
    String name;
    double marks;
    // no constructor writtern: the compiler adds Student(){} itself
}

public class DefaultConstructor {
    public static void main(String[] args){
        Student s1 = new Student();   // calling the default constructor

        System.out.println("Roll no: " + s1.roll);
        System.out.println("Name: " + s1.name);
        System.out.println("Marks: " + s1.marks);

    }
    
}
