import java.util.Scanner;

public class Sum13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<n){
            if(n%i==0){
               sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);
        if(sum==n){
            System.out.print("perfect number");
        }
        else{
            System.out.print("not a perfect number");
        }
    }
}  

