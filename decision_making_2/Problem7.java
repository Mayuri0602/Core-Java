import java.util.*;
public class Problem7{

   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter value of n1: ");  
        int n1=sc.nextInt();
        
        System.out.println("Enter value of n2: ");  
        int n2 = sc.nextInt();
        
    if (n1>n2){
        System.out.println("value of n1 is greater"); 
    }
     else if (n2>n1){
        System.out.println( "value of n2 is greater" ); 
     }  
     else if (n1==n2){
        System.out.println("value of both numbers are equal"  );    
    }
    else{
        System.out.println("input not matched");
    }
 }
}