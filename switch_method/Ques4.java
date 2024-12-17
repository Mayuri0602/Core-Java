import java.util.Scanner;

public class Ques4{
    public static void main(String[] args){
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter any operator:\n +\n -\n *\n /\n");
        char ch=oc.next().charAt(0);
        System.out.print("Enter the value of a and b:");
        int a=oc.nextInt();
        int b=oc.nextInt();
        int add,sub,product,div;
        switch(ch){
            case '+':{
                add=a+b;
                System.out.println("sum :"+add);
                break;
            }
            case '-':{
                sub=a-b;
                System.out.println("sub :"+sub);
                break;
            }
            case '*':{
                product=a*b;
                System.out.println("product:"+product);
                break;
            }
            case '/':{
                div=a/b;
                System.out.println("div :"+div);
                break;
            }
            default:{
                System.out.println("Input mismatched");
            }
        }
             
    }
} 
