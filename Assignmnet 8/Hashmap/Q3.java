
import java.util.HashMap;

class demo
{
    public static void main(String[] args)
    {
        int[] arr={1,1,2,2,3};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        int k=2;
         System.out.print("Equal to k  : " );


        for(Integer key:mp.keySet())
        {
            if(mp.get(key)==k)
            {
               
                 System.out.print(key + " ");
                

            }
        }
       
    }
}