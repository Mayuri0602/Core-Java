import java.util.*;
class Car{
    Car(String model,int year){
        System.out.println("Model: " +model);
        System.out.println("Year: " +year);
    }
}
public class Constructor2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the model of the car:");
        String model=sc.next();
        System.out.println("Enter the year of the car:");
        int year=sc.nextInt();
        new Car(model, year);
    }
}
