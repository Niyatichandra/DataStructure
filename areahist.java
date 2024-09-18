import java.util.Stack;
import java.util.Scanner;
public class areahist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] a= new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int[] r= new int[a.length];
        Stack<Integer> st=new Stack<>();
        st.push(a.length-1);
        r[a.length-1]=a.length;
        for(int i=a.length-2;i>=0;i--)
        {
            while(st.isEmpty() && a[i]<a[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                r[i]=a.length;
            }
            else {
                r[i]=st.peek();
            }
            st.push(i);
        }
        int[] l= new int[n];
        st=new Stack<>();
        st.push(0);
        l[0]=1;
        for(int i=1;i<a.length;i++)
        {
            while(st.isEmpty() && a[i]<a[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                l[i]=-1;
            }
            else {
                l[i]=st.peek();
            }
            st.push(i);
        }
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            int width=r[i]-l[i]-1;
            int area=a[i]*width;
            if(area>max)
            {
                max=area;
            }
        }
        System.out.println(max);
    }
}
