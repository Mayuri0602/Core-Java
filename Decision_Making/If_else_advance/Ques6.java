package If_else_advance;
import java.util.*;
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

            System.out.print("Enter the height:");
           int  cm = sc.nextInt();
            if(cm > 175)
            {
                System.out.println("High");
            }
            else if(cm > 155 && cm <= 175)
            {
                System.out.println("Mid");
            }
            else
            {
                System.out.println("low");
            }
        }
    }
