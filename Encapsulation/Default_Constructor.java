class Person{
    String name="Unknown";
    int age=0;
    Person(){
        System.out.println("Name: " +name);
        System.out.println("Age:" +age);
    }
}
public class Default_Constructor {
    public static void main(String[] args) {
        new Person();
    }
}   

