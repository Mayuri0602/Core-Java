public class fact_while{
    public static void main(String[] args){
        int a=5;
        int b=1;
        int fact=1;
        while(b<=a){
            fact=fact*b;
            b++;
        }
        System.out.println(fact);
    }
}
