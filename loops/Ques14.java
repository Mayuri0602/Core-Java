import java.util.Scanner;

public class Ques14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int i=1;
        int table;
        while(i<=10){
            table=i*n;
            System.out.println (+table);
            i++;
        }
    }
}