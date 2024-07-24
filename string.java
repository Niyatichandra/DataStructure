import java.util.ArrayList;
import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        String str="hello";
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
        String ss=str.substring(0,3);
        System.out.println(ss);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.set(2,300);
        list.add(1,400);
        System.out.println(list+","+list.size());


    }
}

