import java.util.Scanner;
class Triangle
{
    double Area;
    double Perimeter;
    double Height;
    double Base;
    double a,b,c;
    public double getArea()
    {
       return Area = Height * Base / 2.0; 
    }
    public double getPeri()
    {
      return Perimeter = a + b + c;  
    }
    public static void main (String[] args) 
    {
        Scanner TR = new Scanner(System.in);
        System.out.println("Enter the Height of the Triangle:");
        double Height = TR.nextDouble();
        System.out.println("Enter the Base of the Triangle:");
        double Base = TR.nextDouble();
        Triangle A = new Triangle();
        A.Height = Height;
        A.Base = Base;
        System.out.println("The Area of Triangle is:" + A.getArea());
        System.out.println("Enter the Side1 of the Triangle:");
        double a = TR.nextDouble();
        System.out.println("Enter the Base of the Triangle:");
        double b = TR.nextDouble();
        System.out.println("Enter the Side2 of the Triangle:");
        double c = TR.nextDouble();
        Triangle P = new Triangle();
        P.a = a;
        P.b = b;
        P.c = c;
        System.out.println("The Perimeter of the Triangle:" + P.getPeri());
    }

}
