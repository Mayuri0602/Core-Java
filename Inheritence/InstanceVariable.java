
class A {
    int num1, num2;
    A(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    void add() {
        int sum = num1 + num2;
        System.out.println("Addition: " + sum);
    }
}
class B extends A {
    B(int num1, int num2) {
        super(num1,num2);    //super
    }
    void subtract() {
        int difference = num1 - num2;
        System.out.println("Subtraction: " + difference);
    }
}

public class InstanceVariable {
    public static void main(String[] args) {
        B b = new B(10, 5);
        b.subtract();
        b.add();  
    }
}

