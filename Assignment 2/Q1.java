import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        for(int i=0 ; i<num ; i++)
        {
            for(int j=0 ; j<num ; j++)
            {
                if((i>=1 && i<4) && (j>=1 && j<4))
                {
                    System.out.print("  ");
                }
                else{
                    System.out.print("*" + " ");
                }
                
            }
            System.out.println();
        }

    }
}