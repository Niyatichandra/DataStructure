import java.util.Scanner;
public class increase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        inc(n);

    }
    public static void inc(int n)
    {
        if(n<1)
            return;
       inc(n-1);
       System.out.println(n);
    }
}
