import java.util.Scanner;
public class Problem8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println("Enter the ticket price:");
        int price=sc.nextInt();
        int discount;
        
        if(age<12){
            discount=(price*50)/100;
            price=price-discount;
            System.out.println("Ticket price is:"+price);
        }
        else if(age>=65){
            discount=(price*30)/100;
            price=price-discount;
            System.out.println("Ticket price is:"+price);
        }
        else{
            System.out.println("Discount not found");
            System.out.println("Ticket price is:"+price);
        }
    }
}
