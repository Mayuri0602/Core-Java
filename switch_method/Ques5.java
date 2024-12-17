import java.util.*;
public class Ques5 {
   public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter any character:");
        char ch=sc.next().charAt(0);
        
        switch(ch){
            case 'a':{
                System.out.print("Enter the age:");
                int age=sc.nextInt();
                if(age>=18)
                System.out.println("valid for voter id");
                else
                System.out.println("not valid for voter id");
                break;
            }
            default:{
                System.out.println("Input mismatched");
                break;
            }
        }
   }
}                    