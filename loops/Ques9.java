import java.util.*;
public class Ques9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt( );
        System.out.println("Enter the value of b");
        int b=sc.nextInt( );
        while(a<=b){
            System.out.print(a+ " ");
            a++;
        }
    }
}
