class Student{
    Student(){
        String name="Anonymous";
        int marks=0;
        System.out.println("Student's name:" +name);
         System.out.println("Marks:" +marks);
    }
}
public class NoArgumentConstructor {
    public static void main(String[] args) {
        new Student();
    }
}
