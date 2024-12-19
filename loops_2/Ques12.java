import java.util.*;
public class Ques12 {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the number1: ");
    int n1=sc.nextInt( );
    System.out.println("Enter the number2: ");
    int n2=sc.nextInt( );
    int table;
    for (int i=n1;i<=n2;i++){
        for(int j=1;j<=10;j++){
          System.out.print(i*j+ " ");  
        }
        System.out.println( );
    }
  }  
}
