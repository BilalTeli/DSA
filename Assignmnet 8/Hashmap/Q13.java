import java.util.HashMap;

class demo
{
    public static void main(String[] args)
    {
        int[] arr={1,2,2,3};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=hm.get(arr[i]);
        }
        System.out.print("Array :  " );
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
