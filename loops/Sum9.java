import java.util.*;
public class Sum9 {
   public static void main(String[] args) {
    Scanner sc=new Scanner (System.in) ;
    System.out.println("Enter the number:");
    int n=sc.nextInt( );
    int count=0;
    while(n>0){
        count++;
        n=n/10;
    }
    System.out.println("Count digits of a number:" +count);
   } 
}
