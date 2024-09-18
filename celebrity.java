import java.util.Scanner;
import java.util.Stack;
public class celebrity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of people");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.println("enter knowns");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
        }
        find_celebrity(arr);
    }
    public static void find_celebrity(int[][] arr)
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
            st.push(i);
        while(st.size()>=2)
        {
            int a=st.pop();
            int b=st.pop();
            if(arr[a][b]==1)//a knows b-a is not celebrity
                st.push(b);
            else
                st.push(a);//b knows a- b is not a celebrity
        }
        int p=st.pop();
        for(int i=0;i<arr.length;i++){
            if(i!=p) {
                if (arr[i][p] == 0 || arr[p][i] == 1) {
                    System.out.println("no celebrity");

                }
            }

        }
        System.out.println(p+1+"is a celebrity");

    }

}
