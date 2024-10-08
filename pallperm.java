import java.util.HashMap;
import java.util.Scanner;
public class pallperm {
    public static void gen(int cs, int ts, HashMap<Character,Integer> fmap,Character oddc,String asf)
    {
        if(cs>ts) {
            String rev = "";
            for (int i = asf.length() - 1; i >= 0; i--) {
                rev += asf.charAt(i);
            }
            String res = asf;
            if (oddc != null) {
                res += oddc;
            }
            res+=rev;
            System.out.println(res);
            return;
        }
        for(char ch:fmap.keySet())
        {
            int freq=fmap.get(ch);
            if(freq>0){
            fmap.put(ch, freq - 1);
            gen(cs + 1, ts, fmap, oddc, asf + ch);
            fmap.put(ch, freq );
        }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        HashMap<Character,Integer> fmap=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(fmap.containsKey(ch))
            {
                int o=fmap.get(ch);
                fmap.put(ch,o+1);
            }
            else
            {
                fmap.put(ch,1);
            }
        }
        Character odd=null;
        int odds=0;
        int len=0;
        for(char ch:fmap.keySet())
        {
            int f=fmap.get(ch);
            if(f%2==0)
            {
                odd=ch;
                odds++;
            }
            fmap.put(ch,f/2);
            len+=f/2;
        }
        if(odds>1)
        {
            System.out.println(-1);
            return;
        }
        gen(1,len,fmap,odd,"");
    }
}
