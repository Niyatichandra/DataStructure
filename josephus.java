import java.util.Scanner;
public class josephus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(sol(n,k));
    }
    public static int sol(int n,int k)
    {
        if(n==1)
            return 0;
        int sx=sol(n-1,k);
        int sy=(sx+k)%n;
        return sy;
    }
}
