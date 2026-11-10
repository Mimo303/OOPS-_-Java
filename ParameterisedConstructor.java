//package Constructors;

class Rectangle{
    double lenght, width;

    Rectangle(double length, double width){
        this.lenght = length;
        this.width = width;

    }
    double Area(){
        return  lenght * width;
        //System.out.println("Rectangle Area: " + area);
    }
    double Perimeter(){
        return 2 * (lenght + width);
        //System.out.println("Rectangle Perimeter: " + perimeter);
    }
}

class Employee{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void displayEmpInfo(){
        System.out.println("Id: " + id + "|" + "Name: " + name + "|" + "Salary: " + salary);
    }
}

public class ParameterisedConstructor {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(4.0, 3.0);
        
        System.out.println(" r1 Area: " + r1.Area() + "Perimeter: " + r1.Perimeter());

        Rectangle r2 = new Rectangle(3.0, 9.0);

        System.out.println("r2 Area: " + r2.Area() + "Perimeter: " + r2.Perimeter());
        

        Employee e1 = new Employee(100,"James",23000);
        Employee e2 = new Employee(101, "Chao",24000.00);
        e1.displayEmpInfo();
        e2.displayEmpInfo();


    }
    
}
