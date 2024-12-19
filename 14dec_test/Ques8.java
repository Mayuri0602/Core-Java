import java.util.*;
public class Ques8 {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter student's score : ");
    int s=sc.nextInt();
    if(s>90){
        System.out.println("Grade A");
    }
   else if(s>80 && s<90){
        System.out.println("Grade B");
    }
    else if(s>70 && s<80){
        System.out.println("Grade C");
    }
    else if(s>60 && s<70){
        System.out.println("Grade D");
    }
    else{
    System.out.println("Fail");
    }
}
}