package oops_assignment;

public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double length,double width) {
        this.length = length;
        this.width=width;
    }
public double getLength()
{
    return length;
}
public void setLength(double len) 
{
    this.length=len;
}
public double getWidth() {
    return width;
}
public void setWidth(double width) {
    this.width = width;
}
public void calculate(double length,double width)
{
    System.out.println("The area is : "+ length*width);
    System.out.println("The perimeter is: " + (2*(length+width)));
}
public static void main(String[] args) {
    Rectangle r1 = new Rectangle(4,5);
    System.out.println("Area of rectangle 1 is: ");
    r1.calculate(r1.getLength(),r1.getWidth());
    Rectangle r2 = new Rectangle(6,7);
    System.out.println("\nArea of rectangle 2 is:");
    r2.setLength(r1.getLength());
    r2.setWidth(r1.getWidth());
    r2.calculate(r2.getLength(),r2.getWidth());
}
    
}
