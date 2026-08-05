public class book {
    // Fields
    String title;
    String author;
    double price;

    // Constructor
    public book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;

    }

    // Methods to display the book details
    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args){
        // Create an array of 5 Book onjects
        book[] books = new book[5];

        books[0] = new book("To Kill a Mockingbird", "Harper Lee", 12.99);
        books[1] = new book("1984", "George Orwell", 15.50);
        books[2] = new book("The Great Gatsby", "F. Scott Fitzgerald", 10.20);
        books[3] = new book("Design Patterns", "Erich Gamma et al.", 54.99);
        books[4] = new book("Clean Code", "Robert C. Martin", 42.30);


        // Algorithm to find the most expensive book
        // Assume the first book is the most expensive one 

        book mostExpensive = books[0];

        for(int i=1; i < books.length; i++){
            if(books[i].price > mostExpensive.price){
                mostExpensive = books[i];
            }

            System.out.println("----- Most Expensive Book -------");
            mostExpensive.displayInfo();
        }
    }
    
}
