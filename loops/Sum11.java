import java.util.Scanner;
public class Sum11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int sum=0,rem=0;
        while(n>0){
            rem=n%10;
            rem=rem+1;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.print(sum);
    }
}
