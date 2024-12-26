
class A {
    void method1() {
        System.out.println("Method1 in class A: No arguments, no return value.");
    }

    void method2(int value) {
        System.out.println("Method2 in class A: Argument received: " + value);
    }
}

class B extends A {
    String method3() {
        return "Method3 in class B: Returning a value.";
    }

    String method4(int value) {
        return "Method4 in class B: Returning value with argument: " + value;
    }
}

public class Singlelevel {
    public static void main(String[] args) {
    
        B b = new B();

        b.method1();  
        b.method2(10); 

        String result3 = b.method3(); 
        System.out.println(result3);  

        String result4 = b.method4(20);  
        System.out.println(result4);  
    }
}

