import java.util.HashMap;

class demo
{
    public static void main(String[] args)
    {
        int[] arr1={1,1,2,2,2,3,7};
        int[] arr2={1,1,2,2,3};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr2.length;i++)
        {
            hm.put(arr2[i],hm.getOrDefault(arr2[i],0)+1);
        }
        for(int i=0;i<arr1.length;i++)
        {
            if(!hm.containsKey(arr1[i]) || hm.get(arr1[i])==0)
            {
                System.out.print(arr1[i]+ " ");
            }
            else
            {
                hm.put(arr1[i],hm.get(arr1[i])-1);
            }
        }
    }
}
