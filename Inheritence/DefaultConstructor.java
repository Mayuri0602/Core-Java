
class A {
    
    A() {
        System.out.println("A: default constructor");
    }
}
class B extends A {
    B() {
        super();  
        System.out.println("B: default constructor");
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        B objB = new B();
    }
}

