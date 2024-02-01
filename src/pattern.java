class Pattern
{
    public static void PrintPattern1()
    {
        int n = 5;
        int i,j,k;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
                System.out.print(i+ "");
            }
            for (k= 1; k <= (n-i); k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main (String[] args) 
    {
        PrintPattern1();
    }
    
}
