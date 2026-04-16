import java.util.HashMap;

class demo
{
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] arr={1,1,2,2,3,5};
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        System.out.println(hm);
        
    }
}