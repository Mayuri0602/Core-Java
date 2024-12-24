class A{
    void show1(){
        System.out.println("normal method");
    }
    int show2(int a){
        return a;
    }
}
class B extends A{
    void show3(){
        System.out.println("child class method");
    }
}
public class SingleLevel1{
    public static void main(String[] args) {
        B p=new B();
        p.show1();
        System.out.println(p.show2(67));
        p.show3();
    }
}