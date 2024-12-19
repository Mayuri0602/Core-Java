public class Sum10 {
    public static void main(String[] args) {
        int n1=0, n2=1, n3;
        int n=5;
        System.out.print(n1+" "+n2);
        int i=1;
        while(i<=n){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            i++;
        }
    }
}


