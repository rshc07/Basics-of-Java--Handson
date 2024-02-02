import java.util.Scanner;
class RectangleArea
{
    double area;
    public double returnArea(double Length, double Breadth)
    {
        return Length * Breadth;
    }
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        RectangleArea a = new RectangleArea();
        System.out.println("Enter the rectangle Length:");
        double Length = sc.nextDouble();
        System.out.println("Enter the rectangle Breadth:");
        double Breadth = sc.nextDouble();
        System.out.println("Area of rectangle:" + a.returnArea(Length, Breadth));
      
    }
    
}