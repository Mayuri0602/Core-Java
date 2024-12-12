import java.util.Scanner;
public class CharUserdefine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
    System.out.println("The value of a is " + a);
        char b=sc.next().charAt(0);
        System.out.print("Enter any single character " + b);
    }
}
