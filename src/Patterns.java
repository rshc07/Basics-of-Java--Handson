import java.util.Scanner;
public class Patterns {
    public static void main(String[] args)
    {
        Scanner rows = new Scanner(System.in);
        int numrows = rows.nextInt();

        for (int i = 0; i<numrows; i++)
        {
            for (int j = 0; j<numrows; j++)
            {
                if(j == 0 || i == numrows-1 )
                {
                    System.out.print("*" + " ");
                }else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        rows.close();

        }

}
