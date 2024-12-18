public class Sum3 {
    public static void main(String[] args) {
        int n=183;
        int temp=n;
        int rem,sum=0;
        while(n>0){
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
            if(temp==sum){
                System.out.println("Armstrong number");
            }
            else{
                System.out.println("Not an armstrong number");
            }
        
    }
}
