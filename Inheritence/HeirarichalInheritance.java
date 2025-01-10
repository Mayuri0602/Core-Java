class A{
    void method1(){
        System.out.println("No return and no argument method");
    }
}
class B{
    String method2(){
        String  name="Return and no argument method";
        return name;
    }
}
class C{
    String method3(String a){
    return a;
    }
}
class D{
    void method4(String b){
        System.out.println("No return & argument" );
    }
}
class E{
    E method5(String c){
        System.out.println(c);
        return this;
    }
}
public class HeirarichalInheritance {
    public static void main(String[] args) {
      A a=new A();
      a.method1();
      B b=new B();
      System.out.println(b.method2()); 
      C c=new C();
      System.out.println(c.method3("Return & argument"));
      D d=new D();
      d.method4("No return & argument");
      E e=new E();
      e.method5("covariant");
    }
}
