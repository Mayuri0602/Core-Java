import java.util.*;
class Book{
    private double price;
    void setBook(double price){
        this.price=price;
    }
        double getPrice(){
            return price;
        }
    }

public class Getter_Setter3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the price of the book: ");
        double price=sc.nextDouble();
        Book b=new Book();
        b.setBook(price);
        System.out.println(b.getPrice());
    }
}
