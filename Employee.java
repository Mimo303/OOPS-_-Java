/*Q6. Create a class Employee with name and salary. Write a method giveRaise(double percent) that
increases the salary and print before/after values.*/

class Employee{
    // Fields
    String name;
    double salary;

    // Constructor
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    // Method to increase salary by a percentage
    public void giveRaise(double percent){
        System.out.println("Applying a" + percent + "% raise...");
        double raiseAmount = salary * (percent / 100);
        salary += raiseAmount;
    }

    // Method to display employee details
    public void displayInfo(){
        System.out.println("Employee: " + name + " | Salary: $" + salary);
    }
    public static void main(String[] args){
        // Create an Employee object
        Employee emp = new Employee("Alice Johnson", 60000.00);

        // Print before raise
        System.out.println("--- Before Raise ---");
        emp.displayInfo();
        System.out.println();

        // Give a 10% raise
        emp.giveRaise(10.0);
        System.out.println();

        // Print After raise
        System.out.println("--- After Raise ---");
        emp.displayInfo();
    }
}