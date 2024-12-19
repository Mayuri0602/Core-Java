import java.util.*;

public class Ques13 {
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int rem,sum=0;
        while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
      
        if(temp==sum){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a Palindrome number");
        }
    }
}
 
