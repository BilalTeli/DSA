import java.util.HashMap;

class demo
{
    public static void main(String[] args)
    {
        String str = "apple";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0 ; i<str.length();i++)
        {
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }
        int max = 0;
        for(Character ch:hm.keySet())
        {
            max = Math.max(max, hm.get(ch));
        }
        for(Character ch:hm.keySet())
        {
            if(hm.get(ch)==max)
            {
                System.out.print(ch + " ");
            }
        }

    }
}