//package Constructors;

class Student{
    String name;

    Student(String name){
        this.name = name;
    }
}
public class TTry {
    public static void main(String[] args){
        Student s1 = new Student("james");
        System.out.println(s1.name);
    }
    
}
