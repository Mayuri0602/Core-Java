
     class Employee {
         int salary;
         Employee(int salary) {
            this.salary = salary;  
         }
        public void displaySalary() {
            System.out.println("Employee Salary: $" + salary);
        }
     }
    
        public class Constructor8{
        public static void main(String[] args) {
            Employee employee1 = new Employee(50000);
            employee1.displaySalary();
        }
    }
    

