import java.util.HashMap;

class demo
{
    public static void main(String[] args)
    {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        HashMap<Character,Integer> hm= new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        if(hm.size()==26)
        {
            System.out.println("String is panagram");
        }
        else
        {
            System.out.println("String is not panagram");
        }

    }
}