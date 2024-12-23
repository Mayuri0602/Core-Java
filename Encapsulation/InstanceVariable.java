
import java.util.*;
class A{
   int a,b;
   void add(int x,int y){
    a=x;
    b=y;
    System.out.println("add:"+ (a+b));
   }
 
   void sub(int x,int y){
    a=x;
    b=y;
    System.out.println("sub:"+ (a-b));
   }
 
   void multi(int x,int y){
    a=x;
    b=y;
    System.out.println("multi:"+ a*b);
   }
 
   void div(int x,int y){
    a=x;
    b=y;
    System.out.println("div:"+ a/b);
   }
 }
public class InstanceVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        A k=new A();
        k.add(x,y);
        k.sub(x,y);
        k.multi(x,y);
        k.div(x,y);
    }
}
