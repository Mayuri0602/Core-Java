import java.util.Scanner;
public class UserQues2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        float a=sc.nextFloat();
        System.out.println("Enter the value of b : ");
        int b=sc.nextInt();
        System.out.println("Enter the value of c : ");
        int c=sc.nextInt();
        System.out.println("Enter the value of d : ");
        int d=sc.nextInt();
        System.out.println("Enter the value of e : ");
        float e=sc.nextFloat();
        System.out.println("Enter the value of f : ");
        float f=sc.nextFloat();
        float g=a*(b-c)/d+e-f;
        System.out.println("Value of g = " +g);
    }
}
