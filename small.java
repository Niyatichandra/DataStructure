import java.util.Scanner;
import java.util.Stack;



public class small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int r = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'd') {
                r++;
                st.push(r);

            } else  {
                r++;
                st.push(r);

                for (int t = 0; t < r; t++)
                    System.out.println(st.pop());
            }


        }
    }
}
