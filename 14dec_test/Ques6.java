
public class Ques6 {
 public static void main(String[] args) {
    int year=2200;
    System.out.println("year" +year);
    if(year%4==0 && year%400==0 || year%100!=0){
      System.out.println("Leap year");
  }
  else{
      System.out.println("Not leap year");
  }
 }   
}
