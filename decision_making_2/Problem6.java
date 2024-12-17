
import java.util.*;
public class Problem6
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter temp value in celsius: ");  
        double celsius = sc.nextDouble();

        System.out.println("Enter temp value in fahrenheit: ");  
        double fahrenheit = sc.nextDouble();
        

        double f = celsius*1.8+32; 
    
        double c = (fahrenheit-32)/1.8;
    
        System.out.println("Value of "+fahrenheit+" fahrenheit in celsius: "+ c);   
        System.out.println("Value of "+celsius+" celsius in fahrenheit: "+ f);   
   }
}