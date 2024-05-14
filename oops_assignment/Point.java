package oops_assignment;

public class Point {
    private double X;
    private double Y;
    public Point(double x, double y)
    {
        this.X=x;
        this.Y=y;   
     }
     public double getX() {
         return X;
     }
     public void setX(double x) {
         X = x;
     }
     public double getY() {
         return Y;
     }
     public void setY(double y) {
         Y = y;
     }
     //copy constructor
     public Point(Point p){
         this(p.getX(),p.getY());  
     }
     public static void main(String[] args) {
        Point p1 = new Point(2.5, 3.7);
        System.out.println("Point P1 coordinates: (" + p1.getX() + ", " + p1.getY() + ")");
        Point p2 = new Point(4.8, 6.9);
        System.out.println("\nPoint P2 coordinates: (" + p2.getX() + ", " + p2.getY() + ")");
        Point p3=new Point(p1);
        p3.setX(0.5);
        System.out.println("\nAfter setting point P3's X to 0.5 and keeping Y the same.");
        System.out.println("Point P3 coordinates: (" + p3.getX() + ", " + p3.getY() + ")");
     }
}
