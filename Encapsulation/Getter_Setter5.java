import java.util.*;
class Rectangle{
    private double length;
    private double width;
    void setArea(double length,double width) {
        this.length = length;
        this.width = width;
    }
    double getLength(){
        return length;
    }
    double getWidth(){
        return width;
    }
    void Area(){
        System.out.println("Area of a rectangle: "+length*width);
    }
}
public class Getter_Setter5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length=sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width=sc.nextDouble();
        Rectangle r=new Rectangle();
        r.setArea(length,width);
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
        r.Area();
    }
}
