import java.util.*;
class Animal{
    String name;
    String species;
    Animal(String name, String species) {
        System.out.println("animal name: "+name);
        System.out.println("species name: "+species);
    }
}
public class Constructor3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of the animal: ");
        String name=sc.next();
        System.out.print("Enter the species of the animal: ");
        String species=sc.next();
        new Animal(name,species);
    }
}
