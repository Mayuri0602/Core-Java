import java.util.Scanner;
public class UserQues1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b=sc.nextInt();
        System.out.println("Enter the value of c : ");
        int c=sc.nextInt();
        System.out.println("Enter the value of d : ");
        int d=sc.nextInt();
        System.out.println("Enter the value of e : ");
        int e=sc.nextInt();
        int f=a*b+c/d-e;
        System.out.println("Value of f = " +f);
    }
}
    

