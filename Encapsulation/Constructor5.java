 class Rectangle {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
    
        Rectangle rect = new Rectangle(5.0, 3.0);
        
        System.out.println("Area of Rectangle: " + rect.getArea());     
        System.out.println("Perimeter of Rectangle: " + rect.getPerimeter()); 
    }
}
