import java.util.*;
class A{
    int a,b;
    void add(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Add: "+(a+b));
    }
    void sub(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Sub: "+(a-b));
    }
    void multi(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Multi: "+(a*b));
    }
    void div(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Div: "+(a/b));
    }
}
public class InstanceVariable3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        A p=new A();
        p.add(a,b);
        p.sub(a,b);
        p.multi(a,b);
        p.div(a,b);
    }
}
