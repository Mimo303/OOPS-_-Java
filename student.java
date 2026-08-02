/*Q1. Write a class Student with fields name, roll number, and marks. Create two Student objects and
print their details.*/

public class student {
    // Fields
    String name;
    int rollNumber;
    double marks;

    // Constructor
    public student(String name, int rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Methods to print details
    public void displayDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Roll Number: "+ rollNumber);
        System.out.println("Marks: "+ marks);
        System.out.println("-----------------------------");
    }
    public static void main(String[] args){
        // Creating two Student objects
        student student1 = new student("Aarav sharma",101,89.5);
        student student2 = new student("Priya Verma",103,92.05);

        //printing details 
        student1.displayDetails();
        student2.displayDetails();
    }
    
}
