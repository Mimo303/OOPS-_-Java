class rectangle{
    // Fields
    double length;
    double width;

    // Constructor
    public rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    //method to calculate area
    public double area(){
        return length*width;
    }





    public static void main(String[] args){
        // Creating a 5x3 rectangle object
        rectangle rect = new rectangle(5,3);
        System.out.println("Area of the rectangle: "+ rect.area());
    }
}