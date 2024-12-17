
import java.util.*;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.print("Enter the type:");
        String type=sc.next();
        
        if(type.equals("type1")){
            System.out.print("Enter the case no.=");
            int num=sc.nextInt();
            switch(num){
                case 1:{
                    if(n%2==0){
                        System.out.println("Even number");
                    }
                    else{
                        System.out.println("Not an even number");
                    }
                    break;
                }
                case 2:{
                    if(n%2==1){
                        System.out.println("Odd number");
                    }
                    else{
                        System.out.println("Not an odd number");
                    }
                    break;
                }
                default :{
                    System.out.println("Input mismatched");
                    break;
                }
            }
        }
        else if(type.equals("type2")){
            System.out.print("Enter the alphabet:");
            char alpha=sc.next().charAt(0);
            switch(alpha){
                case 'e':{
                    if(n%2==0){
                        System.out.println("This is even number");
                    }
                    else{
                        System.out.println("This is not even number");
                    }
                    break;
                }
                case 'o':{
                    if (n%2==1){
                        System.out.println("This is odd number");
                    }
                    else{
                        System.out.println("This is not odd number");
                    }
                    break;
                }
                default:{
                    System.out.println("Input mismatch");
                    break;
                }
            }
        }
    }
} 


    