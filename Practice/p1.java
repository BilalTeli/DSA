import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=i-1 ; j++)
            {
                System.out.print(" ");
            }
            for(int k=1 ; k<=2*(n-i)+1 ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}