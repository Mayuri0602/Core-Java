import java.util.Scanner;

public class Ques11 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt( );
        System.out.print("Enter the value of b:");
        int b=sc.nextInt( );
        while(a<=b){
            if(a%2==1){
            System.out.print(a+ " ");}
            a++;
        } 
}
}