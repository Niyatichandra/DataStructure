import java.util.HashMap;
import java.util.Scanner;

import static javax.swing.UIManager.get;

public class CRYPTO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        HashMap<Character, Integer> CharIntMap = new HashMap<>();
        String unique = "";
        for (int i = 0; i < s1.length(); i++) {
            if (!CharIntMap.containsKey(s1.charAt(i))) {
                CharIntMap.put(s1.charAt(i), -1);
                unique += s1.charAt(i);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (!CharIntMap.containsKey(s2.charAt(i))) {
                CharIntMap.put(s2.charAt(i), -1);
                unique += s2.charAt(i);
            }
        }
        for (int i = 0; i < s3.length(); i++) {
            if (!CharIntMap.containsKey(s3.charAt(i))) {
                CharIntMap.put(s3.charAt(i), -1);
                unique += s3.charAt(i);
            }
        }
        boolean[] usednumbers = new boolean[10];
        solution(unique, 0, CharIntMap, usednumbers, s1, s2, s3);

    }

    public static int getNum(String s, HashMap<Character, Integer> charIntMap) {
        String num="";
        for (int i = 0; i < s.length(); i++) {
            num += charIntMap.get(s.charAt(i));
        }
        return Integer.parseInt(num);
    }

    public static void solution(String unique,int idx,HashMap<Character,Integer> charIntMap, boolean[] usednumber,String s1, String s2, String s3)
    {
        if(idx==unique.length())
        {
            int num1=getNum(s1,charIntMap);
            int num2=getNum(s2,charIntMap);
            int num3=getNum(s3,charIntMap);
            if(num1+num2==num3)
            {
                for(int i=0;i<26;i++)
                {
                    char ch=(char)('a'+i);
                    if(charIntMap.containsKey(ch))
                    {
                        System.out.print(ch+"-"+charIntMap.get(ch));
                    }
                }
                System.out.println();
            }
            return;
        }


        char ch=unique.charAt(idx);
        for(int i=0;i<=9;i++)
        {
            if(usednumber[i]==false)
            {
                charIntMap.put(ch,i);
                usednumber[i]=true;
                solution(unique,idx+1,charIntMap, usednumber,s1,s2,s3);
                usednumber[i]=false;
                charIntMap.put(ch,-1);
            }
        }
    }
}