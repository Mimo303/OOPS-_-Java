class circle{
    // Field
    double radius;

    // Constructor
    public circle(double radius){
        this.radius = radius;
    }

    // Method to Calculate area (pi*r^2)
    public double calculateArea(){
        return Math.PI * radius*radius;

    }

    // Method to Calculate circumference( 2*pi*r)
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }


    public static void main(String[] args){
        // Create a cricle object with a radius 5.0
        circle circle = new circle(5.0);

        // Print the radius, area, and circumference
        System.out.println("Radius: " + circle.radius);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());


    }
}