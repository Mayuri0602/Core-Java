import java.util.*;
public class Uppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0); 
        if (ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }
        else if (ch>='a'&& ch<='z' ){
            System.out.println("Lowercase");
        }
    }
    
}
