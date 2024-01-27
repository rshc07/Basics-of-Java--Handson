import java.util.Scanner;
public class Area
{
    private static double Length;
    private static double Breadth;
    public static void setDim(double l, double b)
    {
        Length = l;
        Breadth = b;

    }
        public static void getArea()
        {
            double area = Length * Breadth;
//            double a = area * 0.5;
            System.out.println(area);

        }

    public static void main(String[] args)
    {
        Scanner Length = new Scanner(System.in);
        System.out.println("Enter the Length:");
        Length.nextDouble();
        Scanner Breadth = new Scanner(System.in);
        System.out.println("Enter the Breadth:");
        Breadth.nextDouble();
        System.out.print("Area of the Triangle:");
        Area.getArea();

    }


}