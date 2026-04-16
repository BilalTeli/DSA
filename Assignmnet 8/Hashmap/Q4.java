import java.util.HashMap;

class demo
{
    public static void main(String[] args)
    {
        int[] arr={1,2,2,2,2,4,4};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        for(Integer key:hm.keySet())
        {
            if(hm.get(key)==1)
            {
                System.out.println(key);
            }
        }
        
    }
}