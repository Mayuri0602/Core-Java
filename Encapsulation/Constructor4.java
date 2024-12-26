class Book {
     String title;

    // Constructor that accepts a title and assigns it to the instance variable
     Book(String title) {
        this.title = title;  // Assign the given title to the instance variable
    }

}

public class Constructor4{
    public static void main(String[] args) {
    Book myBook=new Book("The Alchemist");
    System.out.println(myBook.title);    
    }
}