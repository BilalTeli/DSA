
import java.util.HashMap;

class demo
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,3,4};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int count=0;
        for(Integer key:hm.keySet())
        {
            if(hm.get(key)==1)
            {
               count++;
            }
        }
        int[] result= new int[count];
        int k=0;
        for(Integer key:hm.keySet())
        {
            if(hm.get(key)==1)
            {
                result[k]=key;
                k++;
            }
        }
        System.out.print("REsult : ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + "  ");
        }
        
    }
}