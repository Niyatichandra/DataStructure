import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
//import java.util.Scanner;
public class greatelement {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        // int n=sc.nextInt();
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            // a[i]=sc.nextInt();
            a[i] = Integer.parseInt(br.readLine());
        }
        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] a) {
        int[] nge = new int[a.length];
        Stack<Integer> st = new Stack<>();
        st.push(a[a.length - 1]);
        nge[a.length - 1] = -1;
        for (int i = a.length - 2; i >= 0; i--) {
            while (st.size() > 0 && a[i] >= st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(a[i]);
        }
        return nge;

    }

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }


}