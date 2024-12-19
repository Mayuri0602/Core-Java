import java.util.Scanner;

public class Ques13{
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the number1: ");
    int n1=sc.nextInt( );
    System.out.println("Enter the number2: ");
    int n2=sc.nextInt( );
    for(int i=1;i<=100;i++){
        if(i%n1==0 && i%n2==0){
            System.out.print(i+" ");
        }
}
    }
}