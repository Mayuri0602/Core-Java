class A {
    String show (String name ){
        return name;
    }
}
class B{
B show1 (String name){
    System.out.println((name));
    return this;
}
}
public class dec4 {
    public static void main(String[] args) {
        A p=new A();
        System.out.println(p.show("Hello World"));
        B s=new B();
        s.show1("Welcome to India"); 
    }
}
