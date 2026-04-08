import java.util.Scanner;
class demo{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entera  number : ");
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=n ; j++)
            {
                if(((i%2!=0)&&((i+j)%2==0))||((i%2==0)&&((i+j)%2==0)))
                {
                    System.out.print("*"+" ");
                }
                else if(((i%2!=0)&&((i+j)%2!=0))||((i%2==0)&&((i+j)%2!=0)))
                {
                    System.out.print("#"+" ");
                }
                


            }
            System.out.println();
        }
    }
    
}
