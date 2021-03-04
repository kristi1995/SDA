import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int x=1, y=1;
        System.out.print("Enter rows ");
        x = keyboard.nextInt();
        System.out.print("Enter columns ");
        y = keyboard.nextInt();

        for (int i=1; i<=x; i++)
        {
            for (int j=1; j<=y; j++)
            {
                int a = i*j;
                System.out.printf("%4d", a);
            }
            System.out.println();
        }
    }
}
