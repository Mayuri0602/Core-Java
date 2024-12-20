
class A{
    String show ( ){
        String name="Method1";
        return name;
    }
}

class B{
    String main( ){
        String name="Method2";
        return name;
    }
} 

class C{
    String add( ){
        String name="Method3";
        return name;
    }

    String sub( ){
        String name="Method _a";
        return name;
    }
} 

class D{
    String mode( ){
    String name="Method4";
    return name;
}
}
    public class Sub6 {
    public static void main(String[] args) {
        A s=new A();
        System.out.println(s.show());

        B r=new B();
        System.out.println(r.main());
        
        C u=new C();
        System.out.println(u.sub());
        System.out.println(u.add());

        D v=new D();
        System.out.println(v.mode());
    } 
}
