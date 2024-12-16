package If_else_advance;

import java.util.Scanner;

public class Ques4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Check if the character is an alphabet or a digit
        if (Character.isAlphabetic(ch)) {
            System.out.println( "alpha = " +ch);
        } 
         else if (Character.isDigit(ch))
         {
            System.out.println("digit = " +ch);
        } 
        else {
            System.out.println("neither an alphabet nor a digit" +ch);
        }

    }
}
