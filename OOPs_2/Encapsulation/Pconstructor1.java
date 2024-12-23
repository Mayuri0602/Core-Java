import java.util.*;
class A{
    A(int a,int b){
        int c=a+b;
        System.out.println("add=" +c);
    }
}

class B{
    B(int a,int b){
        int c=a-b;
        System.out.println("sub=" +c);
    }
}

class C{
    C(int a,int b){
        int c=a*b;
        System.out.println("multi=" +c);
    }
}

class D{
    D(int a,int b){
        int c=a/b;
        System.out.println("div=" +c);
    }
}

public class Pconstructor1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        new A(a,b);
        new B(a,b);
        new C(a,b);
        new D(a,b);
    }
}