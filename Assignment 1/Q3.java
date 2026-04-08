import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n =sc.nextInt();
        int num=1;
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0; j<n ; j++)
            {
                System.out.print(num + "  ");
                num++;
            }
            System.out.println();
            num = 1;
        }
    }
}