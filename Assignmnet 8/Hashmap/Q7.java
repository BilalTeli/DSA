import java.util.HashMap;

class demo
{
    public static void main(String[] args)
    {
        int[] arr={1,1,2,2,2,3,3,4,4,5,5};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int least = Integer.MAX_VALUE;
        int secondleast=Integer.MAX_VALUE;
        int answer=0;
        int result=0;
        for(Integer key : hm.keySet())
        {
            
            if(hm.get(key)<least)
            {
                secondleast = least;
                least = hm.get(key);
                result=answer;
                answer=key;
                
            }
            else if (hm.get(key)<secondleast && hm.get(key)!=least) 
            {
                secondleast=hm.get(key);
                result=key;   
            }
        }
        System.out.println("Second least : "+result);
    }
}