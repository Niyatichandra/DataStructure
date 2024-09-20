import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;
public class mover {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of cases");
        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        System.out.println("enter cases");
        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        merge(arr);
    }
    public static void merge(int[][] arr)
    {
       Pair[] pairs=new Pair[arr.length];
       Pair p;
       for(int  i=0;i<arr.length;i++)
       {
           pairs[i]=new Pair(arr[i][0],arr[i][1]);
       }
        Arrays.sort(pairs);
       Stack<Pair> qt=new Stack<>();
       for(int i=0;i<pairs.length;i++) {
           if (i == 0) {
               qt.push(pairs[i]);
           } else {
               Pair top = qt.peek();
               if (pairs[i].st > top.et) {
                   qt.push(pairs[i]);
               } else {
                   top.et = Math.max(top.et, pairs[i].et);
               }
           }
       }
           Stack<Pair> rs = new Stack<>();

           while (qt.size() > 0) {
               rs.push(qt.pop());
           }
           while (rs.size() > 0){

               p = rs.pop();
           }
           System.out.println(p.st + " " + p.et);

    }
    public static class Pair
    {
        int st;
        int et;
        Pair(int st,int et)
        {
            this.st=st;
            this.et=et;
        }
        public int CompareTo(Pair other)
        {
            if(this.st!=other.st)
            {
                return this.st=other.st;
            }
            else {
                return this.et=other.et;
            }
        }
    }

}

