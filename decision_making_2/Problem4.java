import java.util.*;

public class Problem4 {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the time between 0-23:");
  int time=sc.nextInt();
  if(time>=5 && time<12){
      System.out.println("Good Morning!");
  }
  else if(time>=12 && time<16){
      System.out.println("Good Afternoon!");
  }
  else if(time>=16 && time<20){
      System.out.println("Good Evening!");
  }
  else{
      System.out.println("Good Night!");
  }

}    
}
