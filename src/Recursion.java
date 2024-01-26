public class Recursion
{
    public static void Weeks(int n)
    {
        if (n == 7){
            System.out.println(n + "-" + "Sunday");
        } else if (n == 6) {
            System.out.println(n + "-" + "Saturday");
        } else if (n == 5) {
            System.out.println(n + "-" + "Friday");
        } else if (n == 4) {
            System.out.println(n + "-" + "Thursday");
        }else if (n == 3) {
            System.out.println(n + "-" + "Wednesday");
        }else if (n == 2) {
            System.out.println(n + "-" + "Tuesday");
         } else if (n == 1) {
            System.out.println(n + "-" + "Monday");
        } else if (n == 0) {
            System.out.println("stop the Recursive Function");
            return;
        }
        Weeks(n-1);
    }

    public static void main(String[] args) {

        Weeks(7);

    }
}
