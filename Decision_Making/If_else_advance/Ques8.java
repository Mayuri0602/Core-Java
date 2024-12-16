package If_else_advance;

import java.util.Scanner;
public class Ques8{
    public static void main(String[] args){
        Scanner oc=new Scanner(System.in);
        System.out.println("Enter the value of a,b and c:");
        int a=oc.nextInt();
        int b=oc.nextInt();
        int c=oc.nextInt();
        if(a>b && a>c){
            System.out.println("a is maximum");
        }
        else if(b>a && b>c){
            System.out.println("b is maximum");
        }
        else{
            System.out.println("c is maximum");
        }
        
    }
}
