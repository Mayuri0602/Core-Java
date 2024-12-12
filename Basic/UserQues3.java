import java.util.Scanner;
public class UserQues3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        float a=sc.nextFloat();
        System.out.println("Enter the value of b : ");
        float b=sc.nextFloat();
        System.out.println("Enter the value of c : ");
        float c=sc.nextFloat();
        System.out.println("Enter the value of d : ");
        float d=sc.nextFloat();
        System.out.println("Enter the value of e : ");
        float e=sc.nextFloat();
        System.out.println("Enter the value of f : ");
        int f=sc.nextInt();
        System.out.println("Enter the value of g : ");
        int g=sc.nextInt();
        float h=a*b-(c-d)+e-f+g;
        System.out.println("Value of h = " +h);
    }
}
