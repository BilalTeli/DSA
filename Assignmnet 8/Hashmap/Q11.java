import java.util.HashMap;

class demo
{   public static boolean checkstring(String str1,String str2)
    {
        HashMap<Character,Integer> hm= new HashMap<>();
        String string1=str1;
        String string2=str2;
        for(int i=0;i<string1.length();i++)
        {
            hm.put(string1.charAt(i),hm.getOrDefault(string1.charAt(i),0)+1);
        }
        
        for(int i=0;i<string2.length();i++)
        {
           if(!hm.containsKey(string2.charAt(i)))
           {
            return  false;
           }
           hm.put(string2.charAt(i), hm.get(string2.charAt(i))-1);
           if(hm.get(string2.charAt(i))==0)
           {
            hm.remove(string2.charAt(i));
           }
           
           
        }
        return hm.isEmpty();
    }
    
    public static void main ( String[] args)
    {
       System.out.println(checkstring("heart","earth"));
    
    } 

    
}
