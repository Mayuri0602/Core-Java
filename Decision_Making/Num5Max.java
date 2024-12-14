import java.util.*;
public class Num5Max {
    public static void main (String[ ]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        System.out.println("Enter the value of c");
        int c=sc.nextInt();
        System.out.println("Enter the value of d");
        int d=sc.nextInt();
        System.out.println("Enter the value of e");
        int e=sc.nextInt();
        if (a>b && a>c && a>d && a>e){
            System.out.println("a is maximum");
        } else if (b>a && b>c && b>d && b>e){
            System.out.println("b is maximum");
        } else if (c>a && c>b && c>d && c>e){
            System.out.println("c is maximum");
        } else if (d>a && d>b && d>c && d> e){
            System.out.println("d is maximum");
        }
        else{
            System.out.println("e is maximum");
        }
    }
    
}
