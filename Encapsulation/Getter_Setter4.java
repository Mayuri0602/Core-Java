
import java.util.*;
class Employee{
    private double salary;
    void setSalary(double salary) {
        if(salary>=0){
            this.salary = salary;
        }
        else{
            System.out.println("Invalid salary");
            this.salary=0;
        }
    }
    double getSalary() {
        return salary;
    }
}public class Getter_Setter4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        double salary=sc.nextDouble();
        Employee e=new Employee();
        e.setSalary(salary);
        System.out.println(e.getSalary());
    }
}
