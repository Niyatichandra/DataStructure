import java.util.Stack;
import java.util.Scanner;
public class stock {
    public static void display(int[] a)
    {
        StringBuilder sb=new StringBuilder();
        for(int val: a){
            sb.append(val+" ");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int[] span=solve(a);
        display(span);

    }
public static int[] solve(int[] arr)
{
    int[] span=new int[arr.length];
    Stack<Integer> st=new Stack<>();
    st.push(0);
    span[0]=1;
    for(int i=2;i<arr.length;i++)
    {
        while(st.size()>0 && arr[i]>arr[st.peek()])
        {
            st.pop();
        }
        if(st.size()==0)
        {
            span[i]=i+1;
        }
        else
        {
            span[i]=i-st.peek();
        }
        st.push(i);
    }
    return span;
}
}
