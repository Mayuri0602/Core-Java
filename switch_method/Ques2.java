import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'M':{
            System.out.println("Male");
            break;
        }
            case 'F':{
                System.out.println("Female");
                break;
            }
            default:{
                System.out.println("Invalid character");
            }
        }
    }
}

