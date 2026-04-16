
import java.util.HashMap;

class demo
{
    public static void main(String[] args)
    {
        int[] arr={1,2,2,3,3,3,3,3,4,4};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        int k=2;
        int element = -1 ;
        for(Integer key:mp.keySet())
        {
            if(mp.get(key)>k)
            {
               
                element = key;

            }
        }
        System.out.println("Greater than k  :" + element);

    }
}