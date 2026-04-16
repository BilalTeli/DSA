import java.util.HashMap;

class demo
{
    public static void main(String[] args)
    {
        int[] arr={1,2,2,2,3,3,3,3,4,4};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        int freq1=0;
        int secfreq=0;
        int element=0;
        int sec_element=0;
        for(Integer key:mp.keySet())
        {
            if(mp.get(key)>freq1)
            {
                secfreq = freq1;
                freq1=mp.get(key);
                sec_element=element;
                element = key;

            }
        }
        System.out.println("Second height :" + sec_element);

    }
}