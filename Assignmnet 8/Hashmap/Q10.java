import java.util.HashMap;

class demo
{
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] arr1={1,2,2,3};
        int[] arr2={2,2,2};
        for(int i=0;i<arr1.length;i++)
        {
            hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++)
        {
            if(hm.containsKey(arr2[i]) && hm.get(arr2[0])>0)
            {
                System.out.print(arr2[i]+" ");
                hm.put(arr2[i],hm.get(arr2[i])-1);
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("No common elemnt found");
        }

    }
}
