import java.util.Scanner;
public class Sum12{
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
    
        System.out.println("reverse="+sum);
        int rem1=0,sum1=0;
        while(sum>0){
            rem1=sum%10;
            sum1=sum1*10+rem1;
            sum=sum/10;
        }
        System.out.println("again reverse="+sum1);

    }
}

