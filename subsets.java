import java.util.ArrayList;
import java.util.Scanner;
public class subsets {
    static int c=0;
    public static void solution(int i,int n,int k,int rssf,ArrayList<ArrayList<Integer>> ans){
        if(i>n){
            if(rssf==k){
             c++;
             System.out.print(c+".");
             for(ArrayList<Integer> set: ans){
                 System.out.print(set+" ");
             }
             System.out.println();
            }
            return;
        }
        for(int j=0;j<ans.size();j++)
        {
            if(ans.get(j).size()>0)
            {
                ans.get(j).add(i);
                solution(i+1,n,k,rssf,ans);
                ans.get(j).remove(ans.get(j).size()-1);
            }
            else {
                ans.get(j).add(i);
                solution(i+1,n,k,rssf+1,ans);
                ans.get(j).remove(ans.get(j).size()-1);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k= sc.nextInt();
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            ans.add(new ArrayList<>());
        }
        solution(1,n,k,0,ans);
    }
}
