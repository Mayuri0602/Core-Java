class A{
    int a=23,b=34;
    void add(){
        int c=a+b;
    System.out.println("sum=" +c);
}
}
public class Parameterised2 {
    public static void main(String[] args) {
        A p=new A();
        p.add();
    }
}
