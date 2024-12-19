import java.util.Scanner;

public class Problem9 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks of five subjects: ");

        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        int total;
        float avg;
        char grade;

        total = sub1 + sub2 + sub3 + sub4 + sub5;
        avg = (float)(total / 5);

        if (avg > 80)
           { grade = 'A';}
        else if (avg >= 60 && avg <= 80){
            grade = 'B';}
        else if (avg >= 50 && avg < 60){
            grade = 'C';}
        else if (avg >= 35 && avg < 50){
            grade = 'D';}
            else{
                grade = 'F';}

        System.out.println("\n Total marks = "  + total + "/500.0");
        System.out.println("\n Average = "  + avg);
        System.out.println("\n Grade: " + grade );
}
}
