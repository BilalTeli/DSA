import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=1;j<=2*n-1;j++)
            {
                int top = i-1;
                int bottom = (2*n-1)-i;
                int left = j-1;
                int right = (2*n-1)-j;
                int layer = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(n-layer);
            }
            
            System.out.println();
        }
    }
}