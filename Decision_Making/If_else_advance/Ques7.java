package If_else_advance;

import java.util.Scanner;

public class Ques7 {
  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll number of the student:");
        int roll = sc.nextInt();
        System.out.println("Enter Name of the student:");
        String name = sc.next();
        System.out.println("Enter father's name:");
        String father_name = sc.next();
        System.out.println("Enter mother's name:");
        String mother_name = sc.next();
        System.out.println("Enter the address:");
        String address = sc.next();
        System.out.println("Enter contact number (max 10 digits):");
        String contact = sc.next();
        System.out.println("Roll number of the student is: "+roll);
        System.out.println("Name of the student is: "+name);
        System.out.println("Father's name of the student is: "+father_name);
        System.out.println("Mother's name of the student is: "+mother_name);
        System.out.println("Address of the student is: "+address);
        System.out.println("Enter the contact number of the student:"+contact);
        System.out.println("Enter the marks of Physics,Chemistry and Computer application:");
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int computer_application = sc.nextInt();
        int total=physics+chemistry+computer_application;
        double per=(total/300.0)*100;
        System.out.println("Total marks of the student is: "+total+ "/300.0");
        System.out.println("Percentage : "+per+ "%" );
        if(per>=60){
            System.out.println("First Division");
        }
        else if(per<60 && per>=33){
            System.out.println("Second Division");
        }
        else{
            System.out.println("Fail");
        }

    }
}

