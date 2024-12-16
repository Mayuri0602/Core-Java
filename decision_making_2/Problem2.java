
import java.util.*;
public class Problem2 {
 public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the height in cm and weight in kg: " );
    
    double height=sc.nextDouble();
    double weight=sc.nextDouble();
    double BMI = weight/(height*height);

    System.out.print("BMI= " );
    if(BMI<18.5){
        System.out.print("Underweight");
    }
    else if(BMI>=18.5 && BMI<24.9){
        System.out.print("Normal weight");
    }
    else if(BMI>=25 && BMI<29.9){
        System.out.print("Overweight");
    }
    else if(BMI>=30){
        System.out.print("Obesity");
    }
 }   
}
