import java.util.ArrayList;
import java.util.Scanner;
public class keypad {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getkpc(str);
        System.out.println(words);

    }

    static String[] codes = {",", "abc", "def", "ghi", "jkl", "mnop", "qrs", "tuv", "wx", "yz"};

    public static ArrayList<String> getkpc(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String sub = str.substring(1);
        ArrayList<String> rres = getkpc(sub);
        ArrayList<String> mres = new ArrayList<>();
        String codesforch = codes[ch - '0'];
        for (int i = 0; i < codesforch.length(); i++) {
            char chcode = codesforch.charAt(i);
            for (String rstr : rres) {
                mres.add(chcode + rstr);
            }

        }
        return mres;
    }
}

