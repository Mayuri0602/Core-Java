
import java.util.*;
public class IntegerType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int a=sc.nextInt();
        if (a<0){
            System.out.println("entered integer is negative");
        }
        else if (a>0){
            System.out.println("entered integer is positive");
        }
        else if (a==0){
            System.out.println("entered interger is zero");
        }
    }
}    

