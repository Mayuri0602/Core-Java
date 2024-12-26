 class Book {
 String title;
    public Book(String title) {
        this.title = title;  
    }
    public void displayTitle() {
        System.out.println("Book Title: " + title);
    }
}
    public class Constructor7{
    public static void main(String[] args) {
        Book myBook = new Book("Life Is What You Make It");
        myBook.displayTitle();
    }
}

