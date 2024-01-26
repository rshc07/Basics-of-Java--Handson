public class PatternProblems
{
    public static void PrintPattern()
        {
            int i,j,k;
            int n = 5;
            for (i = 1; i <= n; i++)
            {
                for (j = 1; j <= n; j++) {
                    System.out.print(j + " ");
                }
                for (k = 1; k <= n-i; k++)
                {
                    System.out.print(" ");
                }
                System.out.println();
            }

        }
    public static void main(String[] args)
    {
        PrintPattern();
    }
}
