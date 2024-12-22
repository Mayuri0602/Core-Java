class A{
    void method(int a){
        System.out.println("value of a:" +a);
    }
}
class B{
    void method2(int b){
        System.out.println("value of b:" +b);
    }
}
class C{
    void method3(int c){
        System.out.println("value of c:" +c);
    }
    void method4(int d){
        System.out.println("value of d:" +d);
    }
}
class D{
    void method5(int e){
        System.out.println("value of e:" +e);
    }
    void method6(int f){
        System.out.println("value of f:" +f);
    } 
    
    void method7(int g){
        System.out.println("value of g:" +g);
    }
}
public class Method3 {
    public static void main(String[] args) {
        A p=new A();
        p.method(2);
        B q=new B();
        q.method2(3);
        C r=new C();
        r.method3(4);
        r.method4(6);
        D s=new D();
        s.method5(8);
        s.method6(9);
        s.method7(10);
    }
}
