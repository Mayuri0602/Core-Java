import java.util.*;
public class Operators {
    public static void main(Ques4[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num1 : ");
    int num1=sc.nextInt( );
    System.out.println("enter num2 :");
    int num2=sc.nextInt( );
    int add=num1+num2;
    int sub=num1-num2;
    int product=num1*num2;
    double division=num1/num2;
    System.out.println("addition of "+num1+" and "+num2+" is : " +add);
    System.out.println("subtraction of "+num1+" and "+num2+" is : " +sub);
    System.out.println("product of "+num1+" and "+num2+" is : " +product) ;
    System.out.println("division of "+num1+" and "+num2+" is : " +division);
    }
    
}
