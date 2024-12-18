import java.util.*;
public class Ques12 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of a:");
        int a=sc.nextInt();
    System.out.println("Enter the value of b:"); 
    int b=sc.nextInt();   
        int sum=0;
        while(a<=10){
             sum+=a;
             a++;}
     System.out.print(sum);
               
        }
}
