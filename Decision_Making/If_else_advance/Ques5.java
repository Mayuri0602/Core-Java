package If_else_advance;

import java.util.Scanner;

public class Ques5 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks of five subjects:\n ");

        float sub1 = sc.nextFloat();
        float sub2 = sc.nextFloat();
        float sub3 = sc.nextFloat();
        float sub4 = sc.nextFloat();
        float sub5 = sc.nextFloat();

        float total;
        float per;
        char grade;

        total = sub1 + sub2 + sub3 + sub4 + sub5;
        per = (float)((total / 500.0) * 100);

        if (per > 80)
           { grade = 'A';}
        else if (per >= 60 && per <= 80){
            grade = 'B';}
        else if (per >= 50 && per < 60){
            grade = 'C';}
        else if (per >= 45 && per < 50){
            grade = 'D';}
        else if (per >=25 && per < 45) {
            grade = 'E';}
            else{
                grade = 'F';}

        System.out.println("\n Total marks = "  + total + "/500.0");
        System.out.println("\n Percentage = "  + per + "%");
        System.out.println("\n grade: " + grade );
}
}
